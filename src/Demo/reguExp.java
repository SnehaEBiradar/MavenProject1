package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reguExp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.rediff.com");
driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
Thread.sleep(1000);
	}

}
