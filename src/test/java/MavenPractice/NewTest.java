package MavenPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver=null;
	String url = "https://www.facebook.com/";
	
	
  @Test
  public void ExecuteTest() {
	  
	  driver.findElement(By.name("email")).clear();
	  driver.findElement(By.name("email")).sendKeys("sud.v@hotmail.com");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Andal@16");
		driver.findElement(By.xpath("//input[@type = \"submit\"]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudv\\Documents\\Selenium Dowloads\\Selenium Files\\Exe Files\\chromedriver.exe");
		driver= new ChromeDriver();		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("openbrowser method");
		
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("closebrowser method");
	  driver.quit();
  }

}
