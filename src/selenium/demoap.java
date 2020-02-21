package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menunames : menus) {
			String item=menunames.getText();
			System.err.println(item);
			System.out.println(menunames.getText());
			a.moveToElement(menunames).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//div[@id='block_top_menu']/descendant::ul"));
			Actions a1 = new Actions(driver);
			Thread.sleep(2000);
			for (WebElement submenunames : menus) {
				System.out.println(submenunames.getText());
				Thread.sleep(2000);
	}
		}
	}

}

