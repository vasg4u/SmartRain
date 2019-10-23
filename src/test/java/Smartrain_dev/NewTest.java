package Smartrain_dev;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
  @Test  	
  public void forgot_email() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Click here!")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("srinivas.golakoti@xelits.com");
	  driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@class='example-button-row']")).click(); 	  
	  
  }
  @Test 
  public void login() throws InterruptedException {
	     Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("admin@xelits.com");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Welcome01");
		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
	  
	   }
  
  @BeforeTest
  public void smartrainapp() {
	    System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver(); // to initialize the chrome
		driver.manage().window().maximize();
		driver.get("http://dev.smartrain.net");
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.xpath("//span[@class='ng-tns-c0-0 ng-star-inserted']//img[@class='menu_icon']")).click();
  }

}
