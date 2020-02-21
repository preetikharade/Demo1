package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menunames : menus) {
			String item=menunames.getText();
			System.err.println(item);
			a.moveToElement(menunames).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//div[@class='wh-submenu medium-width']"));
			Actions a1 = new Actions(driver);
			Thread.sleep(2000);
			for (WebElement submenunames : submenus) {
				System.out.println(submenunames.getText());
				Thread.sleep(2000);
		}
	}
		
		
	}
}
