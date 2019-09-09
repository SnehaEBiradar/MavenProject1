package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		TakesScreenshot img = (TakesScreenshot)driver;
		File src = img.getScreenshotAs(OutputType.FILE);
	File dest = new File("./photos/a.png");
	FileUtils.copyFile(src,dest);
	
	}

}
