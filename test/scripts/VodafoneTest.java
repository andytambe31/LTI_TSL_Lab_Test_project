package scripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class VodafoneTest {

	public static void main(String[] args) throws InterruptedException {
		File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		driver.get("https://www.vodafone.in");
		driver.manage().window().maximize();
		
		//Store Locator xpath
		By sl=By.xpath("//*[@id='ctl00_TM_liLocator']/a");
        WebElement slw= driver.findElement(sl);
        slw.click();
        
        By cl=By.xpath("//*[@id='ctl00_CU_ddlCircle']");
        WebElement clw= driver.findElement(cl);
        Select dropCity = new Select(clw);
        
        dropCity.selectByVisibleText("Chennai");
        Thread.sleep(1000);
        By cl2=By.xpath("//*[@id='ctl00_CU_ddlCircle']");
        WebElement clw2= driver.findElement(cl2);
        Select dropCity2 = new Select(clw2);
        dropCity2.selectByVisibleText("Haryana");
        
	}

}
