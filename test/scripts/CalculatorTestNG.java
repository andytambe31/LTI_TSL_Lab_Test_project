package scripts;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class CalculatorTestNG {
	
	public static WebDriver driver;
	
@Before
	public void BeforeTest(){
		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		 driver = new FirefoxDriver(ffBinary, firefoxProfile);
		
		driver.get("https://www.ata123456789123456789.appspot.com");
		driver.manage().window().maximize();
}
@Test
public void Test(){
		By Num1 = By.id("ID_nameField1");
		WebElement Num1w = driver.findElement(Num1);
		
		By Num2 = By.id("ID_nameField2");
		WebElement Num2w = driver.findElement(Num2);
		
		By Mul = By.id("gwt-uid-2");
		WebElement Mulw = driver.findElement(Mul);
		
		By Cal = By.id("ID_calculator");
		WebElement Calw = driver.findElement(Cal);
		
		By Num3 = By.id("ID_nameField3");
		WebElement Num3w = driver.findElement(Num3);
		
		Num1w.sendKeys("5");
		Num2w.sendKeys("8");
		
		Mulw.click();
		
		Calw.click();
		//Thread.sleep(1000);
		
		System.out.println(Num3w.getAttribute("value"));
		String result=Num3w.getText();
		System.out.println(result);
}
@After
public void AfterTest(){
		driver.quit();
}
}
