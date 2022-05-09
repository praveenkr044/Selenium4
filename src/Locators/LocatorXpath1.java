package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//Absolute Path
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		// Relative xpath
		//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		
		//xpath with contains()
		
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		

	}

}
