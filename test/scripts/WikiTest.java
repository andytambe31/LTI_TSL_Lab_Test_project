package scripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WikiTest {

	public static void main(String[] args) {
		File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		driver.get("https://www.wikipedia.org");
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium Software");
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.linkText("Selenium (software)")).click();
		String a = driver.findElement(By.id("firstHeading")).getText();
		System.out.println(a);
		System.out.println(driver.getTitle());
	}
}
