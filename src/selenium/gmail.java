package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		WebElement user=driver.findElement(By.id("identifierId"));
		user.sendKeys("preetikharade1234@gmail.com");
		WebElement user1=driver.findElement(By.id("identifierNext"));
		user1.click();
		Thread.sleep(2000);
        WebElement user2=driver.findElement(By.name("password"));
		user2.sendKeys("9623958536");
		WebElement pass=driver.findElement(By.id("passwordNext"));
		pass.click();

}
}
