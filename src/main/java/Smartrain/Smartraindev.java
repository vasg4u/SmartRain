package Smartrain;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByXPath;

public class Smartraindev {
	
	WebDriver driver;

	public void smartrainapp() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver(); // to initialize the chrome
		driver.manage().window().maximize();
		driver.get("http://dev.smartrain.net");
	}
	
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("admin@xelits.com");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Welcome01");
		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
		
	       }
	public void activitylog() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Show More..')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-arrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Sunday')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-1']//div[@class='mat-select-arrow-wrapper']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Device')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='goButton mat-raised-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='detailedActivityOverlay']//div[1]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='detailedActivityOverlayHeaderFunctions']//div[2]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='detailedActivityOverlayHeaderFunctions']//div[2]//img[1]")).click();
		
		
		}
	
	public void sorting() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Employee')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Site Name')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Description')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Activity')]")).click();
	
		
			}
		
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Smartraindev s=new Smartraindev();
		s.smartrainapp();
		s.login();
		s.activitylog();
		s.sorting();
			
		

	}

}

