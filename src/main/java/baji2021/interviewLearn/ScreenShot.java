package baji2021.interviewLearn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String args[]) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverlatest.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement LoginButton = driver.findElementByLinkText("Log in");
		//taking screenshot of webElement
		File Src = LoginButton.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./snaps/webElement1.png");
		FileUtils.copyFile(Src, dest);
		// it will throws IOException need to handle
		//Now take the  screenShot of browser
		
		driver.findElementByLinkText("Log in").click();
		File src2 = driver.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./snaps/browser.png");
		FileUtils.copyFile(src2, dest2);
		
		
		driver.close();
		
	}

}
