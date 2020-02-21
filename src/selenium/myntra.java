package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//WebElement search=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		//search.sendKeys("kurti",Keys.ENTER);
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menunames : menus) {
			String item=menunames.getText();
			System.err.println(item);
			System.out.println(menunames.getText());
			a.moveToElement(menunames).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//div[@class='desktop-categoryContainer']"));
			Actions a1 = new Actions(driver);
			Thread.sleep(2000);
			for (WebElement submenunames : menus) {
				System.out.println(submenunames.getText());
				Thread.sleep(2000);
	}
		}
	}

}
