package baji2021.interviewLearn;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverlatest.exe");
		
		// to download required driver during run time
		//WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
			
		driver.findElementByXPath("//div[text()='I agree']").click();
		System.out.println("after Click");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(driver.getTitle());
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.close();
	}

}
