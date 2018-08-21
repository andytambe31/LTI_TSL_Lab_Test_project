package scripts;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AgileTestingUsingStingArray {

	public static void main(String[] args) {

		File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		driver.get("https://www.agiletestingalliance.org");
		String[] link =new String[100];
		
		for(int i = 1; i<5;i++){
			link[i] = driver.findElement(By.xpath("/html/body/footer/div/a["+i+"]")).getAttribute("href");
		WebElement a = driver.findElement(By.xpath("/html/body/footer/div/a["+i+"]"));
	
		}
		for(int i = 1; i<5;i++){
		System.out.println(link[i]);
		}
	}
}
