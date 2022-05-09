package package4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","G:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/sphinx/login.do");
		String text="identify your self";
		String source=driver.getPageSource();
		if(source.contains(text))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println(false);
		}
		
	}

}
