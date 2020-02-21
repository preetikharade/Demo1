package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoblue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		List<WebElement> menus = driver.findElements(By.xpath("//a[@title='Jewellery']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menunames : menus) {
			//String item=menunames.getText();
			//System.err.println(item);
		//	System.out.println(menunames.getText());
			a.moveToElement(menunames).build().perform();
			Thread.sleep(2000);	
			WebElement blue=driver.findElement(By.xpath("//a[@title='Kadas']"));
			blue.click();
			WebElement img=driver.findElement(By.xpath("//div[@class='p-image']/descendant::img[@alt='The Alok Kada For Him']"));
			img.click();
			Actions a1 = new Actions(driver);
			WebElement buy=driver.findElement(By.xpath("//input[@id='buy-now']"));
			a1.doubleClick(buy).perform();
			

			
	}
	}

}
