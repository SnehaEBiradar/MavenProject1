package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();	
	driver.get("https://salesforce.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
	System.out.println(driver.getClass());
	driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']")).click();
	driver.findElement(By.cssSelector("input.username")).sendKeys("admin");
	driver.findElement(By.cssSelector("#password")).sendKeys("pwd");
	driver.findElement(By.cssSelector("#Login")).click();
	
	
	driver.close();

	
	}

}
