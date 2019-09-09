package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChild {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	//	driver.findElement(By.xpath("//div[@id='fakebox-container']/div/input")).sendKeys("hello");
	driver.findElement(By.xpath("//div[@class='gb_f gb_g']/a")).click();
	}

}
