package selenium;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mfetchele {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement user = driver.findElement(By.name("q"));
		user.sendKeys("java");
		List<WebElement> J = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		for (WebElement options : J) {
			System.out.println(options.getText());

		}
		// J.get(3).click();
	}

}
