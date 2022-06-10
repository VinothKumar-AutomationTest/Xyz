package xyq;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Windowhand {

	@Test
	  void main() {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//tgt328//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		
		driver.get("https://demoqa.com/browser-windows");

		
		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		//button[@id='messageWindowButton']
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		
		for(String i:s) {
			
			System.out.println(i);
		}
		
		
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofDays());
//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));

		// Now iterate using Iterator
//		Iterator<String> I1= s.iterator();
//
//		while(I1.hasNext())
//		{
//
//		String child_window=I1.next();
//
//
//		if(!parent.equals(child_window))
//		{
//		driver.switchTo().window(child_window);
//
//		System.out.println(driver.switchTo().window(child_window).getTitle());
//
//		driver.close();
//		}
//
//		}
//		//switch to the parent window
//		driver.switchTo().window(parent);

		}
	
		}