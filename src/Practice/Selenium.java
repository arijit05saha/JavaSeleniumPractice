package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Selenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Arijit\\Work\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		//Radio Button
//		List<WebElement> radiobuttons = driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label/input"));
//		for (WebElement radiobutton: radiobuttons) {
//			if (radiobutton.getAttribute("value").equals("radio2")) {
//				if (radiobutton.isSelected()) {
//					System.out.println("radiobutton for Option 2 is already selected");
//				}
//				else {
//					radiobutton.click();
//					System.out.println("radiobutton for Option 2 is selected now");
//				}
//			}
//		}
//
		
		
//		//Auto-suggestive text box
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");	
//		List<WebElement> suggestiveItems = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
//		for (WebElement suggestiveItem: suggestiveItems) {
//			if (suggestiveItem.getText().equals("India")){
//				suggestiveItem.click();
//				break;
//			}
//		}
//		Thread.sleep(5000);
//		if (driver.findElement(By.xpath("//input[@id='autocomplete']")).getText().contains("India")){
//			System.out.println("Correctly selected auto suggestive box");
//		}
//		else {
//			System.out.println("Could not set auto suggestive box");
//		}
//		
		
//		//Static dropdown
//		WebElement staticDropdown = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
//		Select dropdown = new Select(staticDropdown);
//		//dropdown.selectByIndex(2);
//		dropdown.selectByVisibleText("Option2");
//		if(dropdown.getFirstSelectedOption().getText().equals("Option2")) {
//			System.out.println("Static dropdown correctly selected");
//		}
//		else {
//			System.out.println("Could not select static dropdown option");
//		}
//		
//		//Checkbox
//		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label/input"));
//		for (WebElement checkbox: checkboxes) {
//			if (checkbox.getAttribute("value").equals("option2")) {
//				if (checkbox.isSelected()) {
//					System.out.println("Checkboc for Option 2 is already selected");
//				}
//				else {
//					checkbox.click();
//					System.out.println("Checkbox for Option 2 is selected now");
//				}
//			}
//		}
		
		
		
		
//		// Switch to Window
//		driver.findElement(By.id("openwindow")).click();
//		
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		String parentWindowID = it.next();
//		String childWindowID = it.next();
//		driver.switchTo().window(childWindowID);
//		
//		System.out.println(driver.getCurrentUrl());
//		if (driver.getCurrentUrl().equals("http://www.qaclickacademy.com/")){
//			System.out.println("Correctly navigated to QAClick Academy Page");
//		}
//		else {
//			System.out.println("Redirected to another page / button not clicked properly");
//		}
//		driver.close();
//		driver.switchTo().window(parentWindowID);
//		System.out.println(driver.getCurrentUrl());
		
		
//		//Switch to Tab
//		driver.findElement(By.id("opentab")).click();
//		
//		Set<String> windowsTab = driver.getWindowHandles();
//		Iterator<String> itTab = windowsTab.iterator();
//		String parentWindowIDTab = itTab.next();
//		String childWindowIDTab = itTab.next();
//		driver.switchTo().window(childWindowIDTab);
//		
//		System.out.println(driver.getCurrentUrl());
//		if (driver.getCurrentUrl().contains("https://www.rahulshettyacademy.com/")){
//			System.out.println("Correctly navigated to Rahul Shetty's page");
//		}
//		else {
//			System.out.println("Redirected to another page / tab not clicked properly");
//		}
//		driver.close();
//		driver.switchTo().window(parentWindowIDTab);
//		System.out.println(driver.getCurrentUrl());
		
//		//Alert Box
//		driver.findElement(By.cssSelector("#name")).sendKeys("Arijit");
//		driver.findElement(By.id("alertbtn")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.cssSelector("#name")).sendKeys("Saha");
//		driver.findElement(By.id("confirmbtn")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		
//		driver.findElement(By.cssSelector("#name")).sendKeys("Saha");
//		driver.findElement(By.id("confirmbtn")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
//		//Mouse Scrolling
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		
//		//Mouse-hover
//		Actions a = new Actions(driver);
//		WebElement move = driver.findElement(By.xpath("//button[@id='mousehover']"));
//		a.moveToElement(move).build().perform();
//		driver.findElement(By.cssSelector("a[href*='top']")).click();
//		
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(2000);
//		a.moveToElement(move).build().perform();
//		driver.findElement(By.xpath("//a[text()='Reload']")).click();
		
		
//		Actions a1 = new Actions(driver);
//		a1.moveToElement(driver.findElement(By.id("displayed-text"))).doubleClick().build().perform();
		
//		// Show-Hide object
//		if (driver.findElement(By.id("displayed-text")).isDisplayed()) {
//			driver.findElement(By.id("displayed-text")).sendKeys("Arijit");
//		}
//		
//		driver.findElement(By.id("hide-textbox")).click();
//		if (! driver.findElement(By.id("displayed-text")).isDisplayed()) {
//			System.out.println("Text box correctly hidden");
//		}
//		else {
//			System.out.println("Cannot hide Text box correctly");
//			System.out.println(driver.findElement(By.id("displayed-text")).getAttribute("value"));
//		}
//		
//		driver.findElement(By.id("show-textbox")).click();
//		if (driver.findElement(By.id("displayed-text")).isDisplayed()) {
//			System.out.println("Text box correctly shown");
//			System.out.println(driver.findElement(By.id("displayed-text")).getAttribute("value"));
//		}
//		else {
//			System.out.println("Cannot show Text box correctly");
//		}
		
//		
		
//		//iFrame -- Scroll down and switch to frame and clisk on element in frame
//		JavascriptExecutor js1 = (JavascriptExecutor)driver;
//		js1.executeScript("window.scrollBy(0,1500)");
//		Thread.sleep(2000);
//		
//		driver.switchTo().frame("courses-iframe");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']/nav/div[2]/ul/li[8]/a")).click();
		
		
		//Get all the courses whose price is below 25 from table 1
		int i = 2;
		Hashtable<String, String> course_price = new Hashtable<String, String>();			
		List<WebElement> prices = driver.findElements(By.xpath("//*[@id='product' and @name='courses']/tbody/tr/td[3]"));
		for (WebElement price: prices) {
			if (Integer.parseInt(price.getText()) < 25) {

				String courseXpath = "//*[@id='product' and @name='courses']/tbody/tr[" + i + "]/td[2]";
				String courseName = driver.findElement(By.xpath(courseXpath)).getText();
				course_price.put(courseName, price.getText());
				
				System.out.println("courseName : " + courseName);
				System.out.println("price : " + price.getText());
			}
			i = i+1;
		}
		System.out.println(course_price);
		
		
		//Calculate Total Amount from the table 2
//		int totalAmount = 0;
//		List<WebElement> amounts = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[4]"));
//		for (WebElement amount: amounts) {
//			totalAmount = totalAmount + Integer.parseInt(amount.getText());
//		}
//		String expectedTotalAmount = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
//		if (expectedTotalAmount.equals(String.valueOf(totalAmount))) {
//			System.out.println("Amount Matched --> " + expectedTotalAmount + " = " + totalAmount);
//		}
//		else {
//			System.out.println("Amount Mismatch --> " + expectedTotalAmount + " != " + totalAmount);
//		}
		
		
		driver.close();
		
	}

}
