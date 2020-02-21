package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class friguru {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload");
		Thread.sleep(2000);
		WebElement file=driver.findElement(By.xpath("//div[@id='file_wraper0']"));
		file.click();
		Thread.sleep(2000);
		Runtime r=Runtime.getRuntime();
		r.exec("‪C:\\Users\\HP\\Desktop\\automation.exe");
		
		
	}

}
