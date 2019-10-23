package Smartrain;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByXPath;

public class sbi {
	

WebDriver driver;
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver(); // to initialize the chrome
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");
	}

	public void login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='pl-login-ornage-box']")).click();
		
	}
	
	public void credentials() throws InterruptedException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']']")).sendKeys("vasg4u");
		driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']']")).sendKeys("srinivas@1526_amma");
		driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']']")).click();
		
	}
   
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		sbi s=new sbi();
		s.browser();
		s.login();
		s.credentials();
	}

}
