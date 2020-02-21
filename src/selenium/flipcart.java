package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement pop=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		pop.click();
		Thread.sleep(2000);
		/*WebElement find=driver.findElement(By.xpath("//input[@type='text']"));
		//find.sendKeys("watch",Keys.ENTER);*/
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menunames : menus) {
			//String item=menunames.getText();
			//System.err.println(item);
			System.out.println(menunames.getText());
			a.moveToElement(menunames).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(By.xpath("//div[@class='_3zdbog _3Ed3Ub']/descendant::li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']"));
			Actions a1 = new Actions(driver);
			Thread.sleep(2000);
			for (WebElement submenunames : menus) {
				System.out.println(submenunames.getText());
				//a1.moveT/oElement(submenunames).build().perform();
				Thread.sleep(2000);
			}
	}
	}
		
}
