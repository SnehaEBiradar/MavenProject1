package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		WebElement a1 = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT"));
		a1.clear();
		a1.sendKeys("Beng");
		a1.sendKeys(Keys.ENTER);
		WebElement b1 = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT"));
		b1.clear();
		b1.sendKeys("chai");
		b1.sendKeys(Keys.ENTER);

//driver.quit();
	}

}
