package gradleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvokeBrowser {
	
	public static WebDriver driver;
	
	public static void LaunchCrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String s = driver.getTitle();
		System.out.println(s);
		
	}

}
