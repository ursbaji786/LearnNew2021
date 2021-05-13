package baji2021.interviewLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverlatest.exe");
		
		// to download required driver during run time
		//WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		driver.manage().window().maximize();
		
		String firstWindow = driver.getWindowHandle();
		System.out.println("main window is " +firstWindow);
		
		driver.findElementById("home").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		// its linked hashset so maintain the inseration order 
		//but in Set we won't have any get methods so will be using list
		
		System.out.println("all windows are " +windowHandles);
		
		//scope will be on main window only to check verifying with url
		
		//System.out.println(driver.getCurrentUrl());
		
		// moving to list as there is NO GET in set
		
		List<String> list = new ArrayList<String>(windowHandles);
		
		//list.get(0); -- parent window
		
		driver.switchTo().window(list.get(1)); // switching to 1st window
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElementById("button").click();
		
		// switch back to parent window
		
		driver.switchTo().window(list.get(0));
		
		Thread.sleep(3000);
		
		driver.close();
		
		//System.out.println(driver.getCurrentUrl()); // NoSuchWindowException as looking window closed so again use windowhandles
		
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		
		// driver.close() will close the current active window 
		
		
		
		// driver.quit() will close the all open windows
		
		
		
		
		
		
		
		
		
		
	}

}
