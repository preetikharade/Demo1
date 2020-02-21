package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> wins=driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList(wins);
		for (int i=a1.size()-1;i>=0;i--)
		{
			driver.switchTo().window(a1.get(i));
			Thread.sleep(2000);
			driver.close();
		}
		
		//wins.remove(parent);
		//System.out.println(wins.getClass());
		/*for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}*/
		//String title = driver.getTitle();
		//System.out.println(title);
		//System.out.println(driver.getCurrentUrl());
		

}
}