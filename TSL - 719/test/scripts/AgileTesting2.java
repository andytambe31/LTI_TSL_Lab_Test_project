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

public class AgileTesting2 {

	public static void main(String[] args) {

		File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		driver.get("https://www.agiletestingalliance.org");
		
		List<WebElement> alist = new ArrayList<WebElement>();
		
		By a=By.xpath("/html/body/footer/div/a");
		alist.addAll(driver.findElements(a));
		
		System.out.println("Iterator\n");
		Iterator<WebElement> iterator = alist.iterator();
		
		while (iterator.hasNext()) {
			System.out.println( (iterator.next()).getAttribute("href"));		
		}
		driver.close();
	}
}
