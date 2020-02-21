package selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c11ihro {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String user="admin";
		String pass="admin";
		String url= "http://"+user+":"+pass+"@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		/*driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);*/  ////another method
	}

}
