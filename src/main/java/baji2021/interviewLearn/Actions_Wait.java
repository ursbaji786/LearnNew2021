package baji2021.interviewLearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Wait {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverlatest.exe");
		ChromeDriver driver =  new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// wait for title change
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[.='✕']").click();
		WebElement elec = driver.findElementByXPath("//span[.='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(elec).perform();
		WebElement apple = driver.findElementByLinkText("Apple");
		wait.until(ExpectedConditions.visibilityOf(apple));
		apple.click();
		wait.until(ExpectedConditions.titleContains("Apple1"));
		System.out.println(driver.getTitle());
	
	
}
}
