package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hwfb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("preeti");
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("kharade");
		WebElement mobi=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobi.sendKeys("9623958536");
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("pree1234");
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("19");
		WebElement mon=driver.findElement(By.id("month"));
		Select s1=new Select(mon);
		s1.selectByValue("2");
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1996");
		/*List<WebElement>days=s.getOptions();
		for(WebElement d:days)
		{
			System.out.println(d.getText());
		}*/
		WebElement female=driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		WebElement sign=driver.findElement(By.xpath("//button[@name='websubmit']"));
		sign.click();
		
	}
}
