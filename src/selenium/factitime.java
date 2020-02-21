package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class factitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		//String title = driver.getTitle();
		//System.out.println(title);
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("admin");
		Thread.sleep(2000);
        WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(2000);
		WebElement que=driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']"));
	    que.click();
	    Thread.sleep(2000);
		//WebElement pop2=driver.findElement(By.xpath("//li[@class='popup_menu_item']/descendant::a[@onclick='MenuHandler.openAbout(); return false;']"));
		//pop2.click();
		//WebElement text=driver.findElement(By.xpath("//span[contains(.,'© 2020 actiTIME Inc. All rights reserved.')]"));
		//System.out.println(text.getText());
		Thread.sleep(2000);
		WebElement con=driver.findElement(By.xpath("//li[@class='popup_menu_item']/descendant::a[@onclick='openSupportForm();']"));
		con.click();
		WebElement text=driver.findElement(By.xpath("//textarea[@placeholder='Type your message here...']"));
		System.out.println(text.getAttribute("placeholder"));
		
		//Thread.sleep(2000);
		//li[@class="popup_menu_item"]/descendant::a[@onclick="MenuHandler.openAbout(); return false;"]
		
	}

}
