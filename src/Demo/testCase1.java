package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
		//(//tagname[@attribute='value'])
//		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("emailbox");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//tagname[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.close();
}
}