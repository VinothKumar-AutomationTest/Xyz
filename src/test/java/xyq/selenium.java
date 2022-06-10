package xyq;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class selenium {
	
	@Test
	  void test() throws AWTException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C://Users//tgt328//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.selenium.dev/downloads/");

	WebElement we=driver.findElement(By.xpath("//span[text()='Documentation']")
			);
	
	
	System.out.println(we.getAttribute("class"));

	Alert a=driver.switchTo().alert();
	a.accept();
	
	a.sendKeys("df");
	a.dismiss();

	Actions ac=new Actions(driver);
	ac.doubleClick().perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_2);
	
	JavascriptExecutor  js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", we);
	
	TakesScreenshot tc=(TakesScreenshot)driver;
	
	tc.getScreenshotAs(OutputType.FILE);
	
	File src=tc.getScreenshotAs(OutputType.FILE);
	
	File des=new File(System.getProperty("user.dir")+"ehjrtre.png");
	
	FileUtils.copyFile(src, des);
	
	driver.quit();
	
	
	driver.switchTo().frame(2);
	driver.switchTo().frame("fe");
	driver.switchTo().frame(we);
	driver.switchTo().defaultContent();//back to the parent page
	driver.switchTo().parentFrame();//this is previous frame
	
	}
}
