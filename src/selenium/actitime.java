+package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://actitime.jmr.co.za/actitime/login.do");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("admin");
		Thread.sleep(2000);
        WebElement user2=driver.findElement(By.name("pwd"));
		user2.sendKeys("manager");
		WebElement pass=driver.findElement(By.xpath("//input[@type='submit']"));
		pass.click();
		/*String actualUrl="https://actitime.jmr.co.za/actitime/login.do";
		String expectUrl=driver.getCurrentUrl();
		if(actualUrl.equalsIgnoreCase(expectUrl))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");	
		}*/


}
}