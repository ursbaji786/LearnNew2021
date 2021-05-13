package baji2021.interviewLearn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_learn {
	
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			// to download required driver during run time
			//WebDriverManager.chromedriver().setup();
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverV89.exe");
			
			//To open browser
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			driver.manage().window().maximize();
			
			// Simple Alert
			
			driver.findElementByXPath("//button[text() = 'Alert Box']").click();
			Thread.sleep(5000);
			// to switch over to alert
			
			
			
			Alert alert = driver.switchTo().alert();
			
			
			  String text = alert.getText(); 
			  System.out.println(text);
			  alert.accept();
			 
			//UnhandledAlertException --> trying to do some action on main window when alert is present but not handled
			//NoAlertPresentException --> trying to do some thing on closed alert
			
			//Confirmation alert
			driver.findElementByXPath("//button[text() = 'Confirm Box']").click();
			Alert alert2 = driver.switchTo().alert();
			String text2 = alert2.getText();
			System.out.println(text2);
			alert2.dismiss();
			
			// Prompt Alert
			
			driver.findElementByXPath("//button[text() = 'Prompt Box']").click();
			
			Alert alert3 = driver.switchTo().alert();
			Thread.sleep(5000);
			
			alert3.sendKeys("checking Promt alert");
			alert3.accept();
			Thread.sleep(3000);
			
			
			// sweet alert or non dialog alert --> we can inspect the alert
			
			driver.findElementByXPath("//button[text() = 'Sweet Alert']").click();
			Thread.sleep(5000);
			
			driver.findElementByXPath("//button[text() = 'OK']").click();
			
		
			
			driver.close();
			
		}

	}

	


