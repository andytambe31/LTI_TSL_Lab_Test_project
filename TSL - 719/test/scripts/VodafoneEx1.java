package scripts;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class VodafoneEx1 {

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
        
        //City dropdown
        By cl=By.xpath("//*[@id='ctl00_CU_ddlCircle']");
        WebElement clw= driver.findElement(cl);
        clw.click();
        
        //For all Cities
        By cityl=By.xpath("//*[@id='ctl00_CU_ddlCircle']/option");
        List<WebElement> alist = new ArrayList<WebElement>();
        alist.addAll(driver.findElements(cityl));
        
        System.out.println("Iterator\n");
		Iterator<WebElement> iterator = alist.iterator();
		
		while (iterator.hasNext()) {
			System.out.println( (iterator.next()).getText());		
		} 
		
		//For selective cities
		
		By cl1=By.xpath("//*[@id='ctl00_CU_ddlCircle']");
        WebElement clw1= driver.findElement(cl1);
        
		By city_l=By.xpath("//*[@id='ctl00_CU_ddlCircle']/option[5]");
        clw1.click();//click dropdown
        WebElement city_w= driver.findElement(city_l);
        city_w.click();//select chennai i.e option[5]
        
        Thread.sleep(500);
    	
    	By cl2=By.xpath("//*[@id='ctl00_CU_ddlCircle']");
        WebElement clw2= driver.findElement(cl2);
        
       /* By city_l_haryana=By.xpath("//*[@id='ctl00_CU_ddlCircle']/option[8]");
        clw2.click();
        WebElement city_w_haryana= driver.findElement(city_l_haryana);
        city_w_haryana.click();
        
        Thread.sleep(500);
        
    	By cl3=By.xpath("//*[@id='ctl00_CU_ddlCircle']");
        WebElement clw3= driver.findElement(cl3);
        
    	By city_l_mumbai=By.xpath("//*[@id='ctl00_CU_ddlCircle']/option[16]");
        clw3.click();
        WebElement city_w_mumbai= driver.findElement(city_l_mumbai);
        city_w_mumbai.click();*/
        
        
        By city=By.xpath("//*[@id='ctl00_CU_ddlCircle']/option[8]");
        clw2.click();
        WebElement city_w1 = driver.findElement(city);
        city_w1.click();
        
        Thread.sleep(500);
        By city2=By.xpath("//*[@id='ctl00_CU_ddlCircle']/option[9]");
        clw2.click();
        WebElement city_w2 = driver.findElement(city2);
        city_w2.click();
        
		}

}
