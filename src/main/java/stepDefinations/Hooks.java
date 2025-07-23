package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	WebDriver driver;

	@Before
	public void driverInitializations() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://admin.stage-insights.restoreskills.com/");
		driver.get("https://rahulshettyacademy.com/client/#/auth/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}
}
