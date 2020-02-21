package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ladder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement pop = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		pop.click();
		Thread.sleep(10000);
		// find=driver.findElement(By.xpath("//input[@id='search']"));
		// find.sendKeys("sofa",Keys.ENTER);
		WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		System.out.println(sale.getText());
		WebElement dining = driver.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		System.out.println(dining.getText());
		WebElement sales = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		System.out.println(sales.getText());
		WebElement dinings = driver.findElement(By.xpath("//li/span[contains(.,'Dining')]"));
		System.out.println(dinings.getText());
		WebElement living = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
		System.out.println(living.getText());
		WebElement livings = driver.findElement(By.xpath("//li/span[contains(.,'Living')]"));
		System.out.println(livings.getText());
		WebElement bedroom = driver.findElement(By.xpath("//li[@class='topnav_item bedroomunit']"));
		System.out.println(bedroom.getText());
		WebElement bedrooms = driver.findElement(By.xpath("//li/span[contains(.,'Bedroom')]"));
		System.out.println(bedrooms.getText());
		WebElement storage = driver.findElement(By.xpath("//li[@class='topnav_item storageunit']"));
		System.out.println(storage.getText());
		WebElement storages = driver.findElement(By.xpath("//li/span[contains(.,'Storage')]"));
		System.out.println(storages.getText());
		WebElement study = driver.findElement(By.xpath("//li[@class='topnav_item studyunit']"));
		System.out.println(study.getText());
		WebElement studies = driver.findElement(By.xpath("//li/span[contains(.,'Study')]"));
		System.out.println(studies.getText());
		WebElement mattress= driver.findElement(By.xpath("//li[@class='topnav_item mattressesunit']"));
		System.out.println(mattress.getText());
		WebElement mattresses = driver.findElement(By.xpath("//li/span[contains(.,'Mattresses')]"));
		System.out.println(mattresses.getText());
		WebElement decor = driver.findElement(By.xpath("//li[@class='topnav_item decorunit']"));
		System.out.println(decor.getText());
		WebElement decors = driver.findElement(By.xpath("//li/span[contains(.,'Decor')]"));
		System.out.println(decors.getText());
		WebElement collect = driver.findElement(By.xpath("//li[@class='topnav_item collectionsunit']"));
		System.out.println(collect.getText());
		WebElement collects = driver.findElement(By.xpath("//li/span[contains(.,'Collections')]"));
		System.out.println(collects.getText());
		WebElement ele= driver.findElement(By.xpath("//li[@class='topnav_item newunit']"));
		System.out.println(ele.getText());
		WebElement eles = driver.findElement(By.xpath("//li/span[contains(.,'New')]"));
		System.out.println(eles.getText());
		WebElement sale1 = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/following-sibling::li"));
		System.out.println(sale1.getText());
		WebElement liv = driver.findElement(By.xpath("//li[@class='topnav_item newunit']/preceding-sibling::li[@class='topnav_item livingunit']"));
		System.out.println(liv.getText());
		WebElement livi = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/following ::span[contains(.,'Living')]"));
		System.out.println(livi.getText());
		WebElement bed = driver.findElement(By.xpath("//span[contains(.,'Living')]/ancestor::div[@id='topnav_wrapper']"));
		System.out.println(bed.getText());
		WebElement li = driver.findElement(By.xpath("//span[contains(.,'Living')]/preceding::div"));
		System.out.println(li.getText());
		
		
		
		
		
		
		
		
		

	}

}
