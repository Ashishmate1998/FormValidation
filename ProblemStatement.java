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
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://unicreds.com/contact-us");
		driver.findElement(By.xpath("//span[text()='×']")).click();
		
		driver.findElement(By.xpath("//button[@class = 'align-right secondary slidedown-button']")).click();
		/*driver.findElement(By.xpath("(//input[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'])[1]")).sendKeys("Ashish Ganesh Mate");
		driver.findElement(By.xpath("(//input[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'])[2]")).sendKeys("ashishmate1997@gmail.com");
		driver.findElement(By.xpath("//textarea[@id = 'message']")).sendKeys("I have to gain Knowledge from u"); 
		WebElement CountryCode = driver.findElement(By.xpath("//select[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']"));
		Select s = new Select(CountryCode);
		s.selectByVisibleText("France (+33)");
		driver.findElement(By.xpath("(//input[@class = 'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'])[3]")).sendKeys("8888583763");
		driver.findElement(By.xpath("//button[@id = 'contactButton']")).click();*/
		driver.findElement(By.xpath("(//a[@class = 'Navbar_dropdownBtn__1ABtM'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class = 'Navbar_dropdownBtn__1ABtM'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class = 'Navbar_loginButton__oj_-G'])[2]")).click();
		driver.quit();
		

	}

}
