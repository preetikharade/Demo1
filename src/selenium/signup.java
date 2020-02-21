package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement google = driver.findElement(By.xpath("//a[@class='google-auth']"));
		google.click();
		WebElement user=driver.findElement(By.xpath("//input[@type='email']"));
		user.sendKeys("preetikharade1234@gmail.com");
		WebElement user1=driver.findElement(By.xpath("//div[@id='identifierNext']"));
		user1.click();
		Thread.sleep(10000);
		WebElement user2=driver.findElement(By.xpath("//input[@type='password']"));
		user2.sendKeys("9623958536");
		WebElement sign=driver.findElement(By.xpath("//div[@id='passwordNext']"));
		sign.click();


	}

}
