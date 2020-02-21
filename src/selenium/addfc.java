package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class addfc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement pop=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		pop.click();
		Thread.sleep(2000);
	List<WebElement> menus = driver.findElements(By.xpath("//span[contains(.,'Electronics')]"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menunames : menus) {
			//String item=menunames.getText();
			//System.err.println(item);
		//	System.out.println(menunames.getText());
			a.moveToElement(menunames).build().perform();
			Thread.sleep(2000);	
			WebElement blue=driver.findElement(By.xpath("//a[@title='OPPO']"));
			blue.click();
			WebElement img=driver.findElement(By.xpath("///img[@alt='OPPO A5s (Blue, 32 GB)']"));
			img.click();
			/*Actions a1 = new Actions(driver);
			WebElement buy=driver.findElement(By.xpath("//input[@id='buy-now']"));
			a1.doubleClick(buy).perform();*/
			
		}
	}
}
