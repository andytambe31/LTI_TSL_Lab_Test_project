package scripts;

import java.io.File;
import java.io.IOException;



import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JqueryuiSample {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		/*File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		*/
		System.setProperty("webdriver.chrome.driver","test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com");

		By autocompleteLocator = By.xpath("//*[@id='sidebar']/aside[2]/ul/li[2]/a");
		WebElement autocompleteWebEle = driver.findElement(autocompleteLocator);
		autocompleteWebEle.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));// use
																				// for																// iframe
		By tagsLocator = By.id("tags");
		WebElement tagsWebEle = driver.findElement(tagsLocator);
		tagsWebEle.click();
		tagsWebEle.sendKeys("s");
		
		Thread.sleep(10000);
		
		//put explicit wait and wait for ul list to be populated

		/*File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\APT-TSL\\screenshot1.png"));
*/
		WebElement optionLocator = driver.findElement(By.id("ui-id-1"));
		List<WebElement> alist = optionLocator.findElements(By.tagName("li"));
		for (WebElement options : alist) {
			System.out.println(options.getText());
			if(options.getText().equals("Asp"))
			{
				System.out.println(options.getText());
				options.click();
				break;
			}
		}
		//Thread.sleep(5000);
		/*for(WebElement i1:alist) 
		{
			
		}*/
		
	}

}
