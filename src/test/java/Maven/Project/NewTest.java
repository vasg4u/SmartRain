package Maven.Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.name("userName")).sendKeys("vasg4u");	
		driver.findElement(By.xpath("//input[@id='label2']"));
  }
  
  @BeforeMethod
  public void browserlaunchup() {
	  System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver(); // to initialize the chrome
		driver.manage().window().maximize();
		driver.get("https://www.onlinesbi.com");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
