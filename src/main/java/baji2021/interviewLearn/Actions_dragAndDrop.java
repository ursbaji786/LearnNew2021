package baji2021.interviewLearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_dragAndDrop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/V89.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();

	}

}
