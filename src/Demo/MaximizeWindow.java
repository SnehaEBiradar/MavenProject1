package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//to delete all the cookies present in the browser
		driver.manage().deleteAllCookies();
		
		//to delete only1 cookie
		driver.manage().deleteCookieNamed("asdf");
		//to add cookie
		//click on any link u will 
		//driver.manage().addCookie(arg0);
		driver.get("http://google.com");
	}

}
