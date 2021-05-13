package baji2021.interviewLearn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesLearn {
	
	public static void main(String[] args)  {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverlatest.exe");
		
		// to download required driver during run time
		//WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		driver.manage().window().maximize();
		
		// switch to frmaes. this is one of example for overloading
		
		//driver.switchTo().frame(0); // moving to first frame
		// other way to swtich frame using id or name
		
		//driver.switchTo().frame("firstFr");
		// other way to swtich frame using xpath i.e frame element
		
		WebElement frameElement = driver.findElementByXPath("//iframe[@src='frameUI']");
		
		driver.switchTo().frame(frameElement);		
		
		driver.findElementByName("fname").sendKeys("baji");
		driver.findElementByName("lname").sendKeys("shaik");
		
		// moving to 2nd frame using frame element Xpath
		
		//driver.switchTo().frame(1); // No such frame exception because inside a frame another frame so index starts again with 0
		WebElement frameElement2 = driver.findElementByXPath("//iframe[@src='innerFrame']");
		
		driver.switchTo().frame(frameElement2);
		
		driver.findElementByName("email").sendKeys("baji@eqi.com");
		
		// switching to parent frame or previous frame i.e. 1 step back frame
		
		//driver.switchTo().parentFrame();
		//driver.findElementByName("lname").sendKeys("babu");
		
		
		// come out of all frames use defaultContent
		
		driver.switchTo().defaultContent();
		
		driver.findElementByXPath("//button[text() = ' Refer the video ']").click();
		
		
		
		
	

	}
		}
