package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class wmyntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("__disable_notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		
	}

}
