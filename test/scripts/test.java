package scripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		
		/*System.setProperty("webdriver.chrome.driver","test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
        
		//searchbox
		By popup=By.xpath("//*[@id='container']/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input");
        WebElement popupw=driver.findElement(popup);
        popupw.sendKeys(Keys.ESCAPE);
        popupw.sendKeys("Sony"+Keys.ENTER);
        
        Thread.sleep(1500);
        //High to low sort
        By high=By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[4]");
        WebElement highw=driver.findElement(high);
        highw.click();
        
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div")).getText());
		
		//*[@id="container"]/div/div[1]/div[2]/div/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
	}

}
