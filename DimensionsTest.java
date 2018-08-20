package scripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DimensionsTest {

	public static void main(String[] args) {
		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		driver.manage().window().maximize();
		driver.get("https://www.agiletestingalliance.org/");
		
		By logoLocator = By.xpath("/html/body/header/div/div/h1/a/img");
		WebElement logoLocatorWebElement = driver.findElement(logoLocator);
		
		Dimension d = logoLocatorWebElement.getSize();
		
		System.out.println("Height:"+d.getHeight());
		System.out.println("Width:"+d.getWidth());
		
		
		
		
		
		
	}

}
