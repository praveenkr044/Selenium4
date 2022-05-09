package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.selenium.dev/downloads/");
System.out.println(driver.getTitle());
driver.quit();


	}

}
