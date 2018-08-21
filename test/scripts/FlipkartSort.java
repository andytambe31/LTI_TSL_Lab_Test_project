package scripts;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FlipkartSort {

	public static void main(String[] args) throws InterruptedException {

		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
        
		//searchbox
		By popup=By.xpath("//*[@id='container']/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input");
        WebElement popupw=driver.findElement(popup);
        popupw.sendKeys(Keys.ESCAPE);
        popupw.sendKeys("Sony"+Keys.ENTER);
        
        Thread.sleep(1500);
        //Low to high sort
        By lowhigh=By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[3]");
        WebElement lowhighw=driver.findElement(lowhigh);
        lowhighw.click();
         
        By fetch= null;
        WebElement fetchWE = null;
        
        String[] str = new String[4];
        int[] amount = new int[4];
        int[] og = new int[4];
   
        int j=0;
        
        for(int i = 2 ; i<=5 ; i++,j++){
        	fetch = By.xpath(" //*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div["+i+"]/div/div/div/a/div[3]/div[2]/div[1]/div/div[1]");
        	fetchWE = driver.findElement(fetch);
        	str[j] = fetchWE.getText();
        	amount[j] = Integer.parseInt(str[j].substring(1));
        	og[j] = Integer.parseInt(str[j].substring(1));
        	}
       
        Thread.sleep(2000);
        
        Arrays.sort(amount);
    
        if (Arrays.equals(amount, og)) // Same as arr1.equals(arr2)
            System.out.println("Price was sorted");
        else
            System.out.println("Not sorted");
	}
}