package xyq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectors {

	@Test
	  void ain() {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C://Users//tgt328//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement we=driver.findElement(By.name("country"));
		
		Select select=new Select(we);
		
		List<WebElement> l=select.getOptions();
				System.out.println(l.size());
				
				for(int i=0;i<l.size();i++) {
				WebElement opt=l.get(i);
				//System.out.println(opt.getText());
				}
		
				for(WebElement e:l) {
					System.out.println(e.getText());
				}
		
		
				
				//select.selectByValue("ANDORRA");
				
				//select.selectByIndex(263);
				

			//	select.selectByVisibleText("ZAMBIA");
				
				
	}

}
