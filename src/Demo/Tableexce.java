package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexce {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scores/20718/eng-vs-aus-4th-test-the-ashes-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-min-inf cb-col-100 ng-scope']"));
		int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-min-itm-rw ng-scope")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-min-itm-rw ng-scope'] div:nth-child(2)"))
				.size();
		for (int i = 0; i < count; i++) {
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-min-itm-rw ng-scope'] div:nth-child(2)")).get(i).getText());

		}

		
	}

}
