package scripts;

import java.io.File;
import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		String undo = Keys.chord(Keys.CONTROL, "z");
		
		
		driver.get("https://www.google.co.in");
		By searchLocator = By.id("lst-ib");
		WebElement search = driver.findElement(searchLocator);
		search.sendKeys("Selenium ");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("Pravin");
		Thread.sleep(2000);
		search.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		search.sendKeys(undo);
		Thread.sleep(2000);
		search.sendKeys(Keys.ENTER);
		// driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		 driver.close();
	}

}
