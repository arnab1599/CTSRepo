package ABD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Arnab {
	@Test
	public void launchURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();


		driver.get("https://www.google.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();


	}

}
