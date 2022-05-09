package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String expectedurl ="https://www.google.co.in/";
		String acturalurl=driver.getCurrentUrl();
		if(acturalurl.equals(expectedurl))
		{
			System.out.println("Test Passed");
			
		}
		else {
			System.out.println("Test fail");
		}
			driver.close();
			

	}

}
