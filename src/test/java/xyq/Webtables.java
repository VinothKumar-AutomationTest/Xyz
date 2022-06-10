package xyq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	  void mai() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//tgt328//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		
		driver.get("https://demoqa.com/webtables");
		
		List <WebElement> tt=driver.findElements(By.tagName("tr"));
		
		
		System.out.println(tt.size());
	}

}
