package sele;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ProblemStatement {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\\\Selenium apps\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
// This method is use to delete all cookies
		driver.manage().deleteAllCookies();
		
// This method is use to maximize the Window
		driver.manage().window().maximize();
		
// This method is specifies time to each element until its available on webpage
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
// This method is use to get Url.
		driver.get("https://unicreds.com/contact-us");						
		
// handling Alert and Pop-Ups
		driver.findElement(By.xpath("//span[text()='×']")).click();  
		driver.findElement(By.xpath("//button[@class = 'align-right secondary slidedown-button']")).click();
		
// Xpath for "Username" and "filled username"	
		driver.findElement(By.xpath("(//input[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'])[1]")).sendKeys("Ashish Ganesh Mate");
		Thread.sleep(2000);
		
// Xpath for "E-mail" and "filled E-mail"
		driver.findElement(By.xpath("(//input[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'])[2]")).sendKeys("ashishmate1997@gmail.com");
		Thread.sleep(2000);
		
// handling Dropdown for "Countrycode" by using Xpath
		WebElement CountryCode = driver.findElement(By.xpath("//select[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']"));
		Select s = new Select(CountryCode);
		s.selectByVisibleText("France (+33)");
		
// Xpath for "Phone" and filled Phone
		driver.findElement(By.xpath("(//input[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'])[3]")).sendKeys("8888583763");
		Thread.sleep(2000);
		
// Xpath for "Message" and filled Message
		driver.findElement(By.xpath("//textarea[@id = 'message']")).sendKeys("I have to gain Knowledge from u");
		Thread.sleep(2000);
		
// Xpath for "Submit" Button and click
		driver.findElement(By.xpath("//button[@id = 'contactButton']")).click();
		Thread.sleep(3000);
		
// Xpath for Student loan and click
		driver.findElement(By.xpath("(//a[@class = 'Navbar_dropdownBtn__1ABtM'])[1]")).click();
		Thread.sleep(3000);
		
// Xpath for Contact us and click
		driver.findElement(By.xpath("(//a[@class = 'Navbar_dropdownBtn__1ABtM'])[2]")).click();
		Thread.sleep(3000);
		
// Xpath for Login Button and Click
		driver.findElement(By.xpath("(//button[@class = 'Navbar_loginButton__oj_-G'])[2]")).click();
		Thread.sleep(2000);
		driver.quit();
		
//	All form fields are verified successfully.
	}

}
