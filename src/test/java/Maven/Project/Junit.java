package Maven.Project;

//import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	WebDriver driver;
		public void browserlaunchup() {
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
			driver=new ChromeDriver(); // to initialize the chrome
			driver.manage().window().maximize();
			driver.get("https://stage.smartrain.net");
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
		public void logout() throws InterruptedException {
	    	Thread.sleep(3000);
	    	//driver.findElement(By.linkText("Profile")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
	}

	@Test
	public void test() {
	}
	
		public void login() throws InterruptedException {
			driver.findElement(By.name("username")).sendKeys("admin@xelits.com");
			driver.findElement(By.name("password")).sendKeys("Welcome01");
			driver.findElement(By.cssSelector("button.btn.btn-block.btn-primary.mt-lg")).click();
			Thread.sleep(3000);
		  Actions a=new Actions(driver);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  a.moveToElement(driver.findElement(By.xpath("//a[contains(@class,'big-logo')]//img"))).build().perform();

	}

}
