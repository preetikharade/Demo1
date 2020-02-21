package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement pop = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		pop.click();
		Thread.sleep(2000);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuname : menus) {
			System.out.println(menuname.getText());
			a.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
		}
		/*List<WebElement> submenus = driver.findElements(By.xpath("//ul[@class='taxonslist']/li[@class='subnav_item 14081']"));
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuname : submenus) {
			System.out.println(menuname.getText());
			a1.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
		}*/
	}

}
//ul[@class='taxonslist']/li[@class='subnav_item 14081']