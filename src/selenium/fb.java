package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.xpath("//input[@type='email']"));
		user.sendKeys("deepika");
		WebElement user1=driver.findElement(By.xpath("//input[@type='password']"));
		user1.sendKeys("1234");
		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		//hghghg
	}
}
