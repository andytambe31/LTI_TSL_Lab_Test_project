package scripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.thoughtworks.selenium.Wait;

public class Test4 {

	public static void main(String[] args) {
		File pathToBinary = new File("C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		driver.get("https://www.google.co.in");
		String s = driver.findElement(By.xpath("//*/a/img")).getAttribute("title");
		System.out.println(s);
		driver.manage().window().maximize();
		//driver.manage().window().setPosition(new Point(-2000, 0));
		String URL="https://www.google.com/search?source=hp&ei=G2l1W_fCE83KsQWrnYnwBg&q=driver.manage%28%29.window%28%29.maximize%28%29+error+in+selenium&oq=maximize+window+in+selenium+e&gs_l=psy-ab.1.0.0i22i30k1.99490.168218.0.170472.42.32.9.0.0.0.901.6643.3-4j6j3j1.14.0....0...1c.1.64.psy-ab..22.20.5340...0j0i131k1j0i13k1j0i13i5i30k1j0i10k1j33i22i29i30k1.0.IjHwgAoNiX8";
		driver.navigate().to(URL);
		driver.navigate().back();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().forward();
	}

}
