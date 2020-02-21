package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wguru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		Alert a1=(Alert) driver.switchTo().frame("//iframe[@src='about:blank']");
		a1.accept();
		WebElement video=driver.findElement(By.xpath("//div[@id='transparentCover']"));
		
	}

}
