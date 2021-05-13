package baji2021.interviewLearn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriverV89.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementById("fruits")
		WebElement fruits = driver.findElementByCssSelector("#fruits");
		Select myFruits = new Select(fruits);
		myFruits.selectByVisibleText("Apple");
		myFruits.selectByVisibleText("Banana");
		System.out.println(myFruits.isMultiple());
		List<WebElement> allFruits = myFruits.getOptions();
		System.out.println(allFruits.size());
		allFruits.forEach(i -> System.out.println(i.getText()));

		WebElement country = driver.findElementById("country");
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");
		WebElement selectedCountry = myCountry.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());

		WebElement heros = driver.findElementById("superheros");
		Select myHeros = new Select(heros);
		boolean isMul = myHeros.isMultiple();
		System.out.println("Is Multiple? "+isMul);
		myHeros.selectByIndex(1);
		myHeros.selectByValue("bt");
		// TODO: loops
		List<WebElement> allHeros = myHeros.getAllSelectedOptions();
		for (WebElement webElement : allHeros) {
			System.out.println(webElement.getText());
		}

		myHeros.deselectByIndex(1);


//		myFruits.deselectByVisibleText("Banana");



		// bootStrap dd

		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.findElementByXPath("(//div[contains(@class,'ui selection')])[1]").click();
		driver.findElementByXPath("(//div[text()='Male'])[1]").click();
	}

	// without select class
	// https://automationtestings.com/how-handle-dropdown-without-select-selenium/
	

	// deselectAll() – To deselect all the selected options.
	// deselectByIndex(int index) – To deselect the option based on its index.
	// deselectByValue(String valueAttribute) – To deselect the option its ‘value’ attribute.
	// deselectByVisibleText(String text) – To deselect the option based on the text over the option.
	// getOptions() – To return list of all the options(List<WebElement>).
	// getAllSelectedOptions() – To return the list of all the selected options(List<WebElement>).
	// getFirstSelectedOption() – To return the selected option or the first selected option in case of dropdowns allowing multi-select.
	// isMultiple() – To return a boolean value, checking if the dropdown allows multiple option select or not.
	
	

}
