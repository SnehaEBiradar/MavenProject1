package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableScore {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
WebDriver driver=new ChromeDriver();
driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20718/eng-vs-aus-4th-test-the-ashes-2019");
WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));	
	int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for(int i=0;i<count-2;i++)
	{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int valueinteger=Integer.parseInt(value);
	sum=sum+valueinteger;
	}
	System.out.println(sum);
	System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
