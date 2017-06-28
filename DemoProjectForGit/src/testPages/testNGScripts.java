package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGScripts {
  @Test
  public void Scenario1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_Workspace_Mobile\\DemoProjectForGit\\drivers\\chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("https://eag.synechron.com");
	  driver.manage().window().maximize();  
	  driver.findElement(By.name("UserName")).sendKeys("testing");
	  driver.findElement(By.name("Password")).sendKeys("testing123"); 
	  driver.findElement(By.className("signInBtn")).click();  
	  Thread.sleep(5000);  
	  driver.close(); 
	  driver.quit();
	  
	  
	    
  }
}
