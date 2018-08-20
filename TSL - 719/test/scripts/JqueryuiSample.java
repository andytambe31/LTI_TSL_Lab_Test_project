package scripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JqueryuiSample {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		File pathToBinary = new File(
				"C:\\Users\\AM101_PC14\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(ffBinary, firefoxProfile);
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com");

		By autocompleteLocator = By
				.xpath("//*[@id='sidebar']/aside[2]/ul/li[2]/a");
		WebElement autocompleteWebEle = driver.findElement(autocompleteLocator);

		autocompleteWebEle.click();
		Thread.sleep(2000);
		// By tagsLocator = By.className("html/body/div/input");
		// By tagsLocator = By.xpath("//*[@id=tags]");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));// use
																				// for
																				// iframe

		By tagsLocator = By.id("tags");
		WebElement tagsWebEle = driver.findElement(tagsLocator);
		tagsWebEle.click();
		tagsWebEle.sendKeys("J");

		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\APT-TSL\\screenshot1.png"));

		By optionLocator = By.xpath("//*[@id='ui-id-1']/li");
		List<WebElement> alist = new ArrayList<WebElement>();
		alist.addAll(driver.findElements(optionLocator));

		for (WebElement i : alist) {
			System.out.println(i.getText());
		}
		
		for (WebElement i : alist) {
			if (i.getText().equals("Java")) {
				System.out.println("Java error :- " + i.getText());
				i.click();
			}
		}

		/*
		 * while(true){
		 * if(driver.findElement(By.xpath("//*[@id='ui-id-3']")).getText
		 * ().equals("Java")){ break; }
		 * 
		 * //break; }
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions
		 * .visibilityOfElementLocated(By.xpath("//*[@id='ui-id-4']")));
		 * //driver.findElement(By.xpath("//*[@id='ui-id-4']")).click();
		 * Thread.sleep(50000);
		 * 
		 * /*List<WebElement> childs;
		 * 
		 * 
		 * for(WebElement i : alist){ childs = i.findElements(By.xpath(".//*"));
		 * 
		 * }
		 */
		// List<String> texts =
		// links.stream().map(WebElement::getText).collect(Collectors.toList());
		// driver.findElements(By.xpath("//*[@id='ui-id-1']/li"))

		/*
		 * By java=By.id("ui-id-6" WebElement javaw=driver.findElement(java);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(javaw));
		 * javaw.click();
		 */
	}

}
