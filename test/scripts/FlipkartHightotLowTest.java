package scripts;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FlipkartHightotLowTest {

	public static void main(String[] args) throws InterruptedException {

		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		int amount1;
		
		// searchbox
		By popup = By
				.xpath("//*[@id='container']/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input");
		WebElement popupw = driver.findElement(popup);
		popupw.sendKeys(Keys.ESCAPE);
		popupw.sendKeys("Sony" + Keys.ENTER);

		Thread.sleep(1500);
		// High to low sort
		By high = By
				.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[4]");
		WebElement highw = driver.findElement(high);
		highw.click();
		
		By product;
		WebElement productWE;
		String str;
		
		By product2;
		WebElement productWE2;
		String str2;
		int[] amount = new int[4];
		int[] og = new int[4];
		
		int j = 0;
		
		for(int i = 2;i <= 5 ; i++,j++){
			
			try{
				product = By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div["+i+"]/div/div/div/a/div[3]/div[2]/div[1]/div/div[1]");
				productWE = driver.findElement(product);
				str = productWE.getText();
				String str1=str.substring(1,2);
				String str3=str.substring(3,5);
				String str4=str.substring(6);
				String str5=str1+str3+str4;
				
				amount1=Integer.parseInt(str5);
				//System.out.println("Str1 "+str1+"\nstr3 "+str3+"\nstr5 "+str4+"\nstr4 "+str5+"\nInteger : "+amount1);//r4,08,300
				amount[j]=amount1;
				og[j]=amount1;
				//System.out.println(amount[j]);
				/*amount[j] = Integer.parseInt(str.substring(1));
				og[j] = Integer.parseInt(str.substring(1));*/
				
			}catch(NoSuchElementException e){
				product2 = By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div["+i+"]/div/div/div/a/div[2]/div[2]/div[1]/div/div");
				productWE2 = driver.findElement(product2);
				str2 = productWE2.getText();
				//System.out.println(str2);
				String str1=str2.substring(1,2);
				String str3=str2.substring(3,5);
				String str4=str2.substring(6);
				String str5=str1+str3+str4;
				amount1=Integer.parseInt(str5);
				amount[j]=amount1;
				og[j]=amount1;
				//System.out.println(amount[j]);
				/*amount[j] = Integer.parseInt(str2.substring(1));
				og[j] = Integer.parseInt(str2.substring(1));*/
			}
			
		}
		driver.close();
        System.out.println("Amount:\n");
		for(int i=0;i<=3;i++)
		{
			System.out.println(amount[i]);
		}
		Arrays.sort(amount);
		
		if(Arrays.equals(amount, og))
			System.out.println("Sorted already!");
		else System.out.println("Not sorted");
	}
}
