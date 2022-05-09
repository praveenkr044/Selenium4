package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	

	}

}
