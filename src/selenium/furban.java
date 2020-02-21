package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class furban {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement pop = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		pop.click();
		Thread.sleep(2000);
		WebElement store = driver.findElement(By.xpath("//a[contains(.,'Stores')]"));
		store.click();
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//div[@class='_3oCTi']"));
		System.err.print(s.getText());
		
		
		
		
	}

}
