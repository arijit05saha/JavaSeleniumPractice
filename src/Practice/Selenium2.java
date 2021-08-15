package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium2 {
	
	public WebElement selectDepart(WebDriver driver) {
		return driver.findElement(By.cssSelector("[aria-label*='departure']"));
	}
	
	public WebElement navigateMonth(WebDriver driver, String month) {
		List<WebElement> months = driver.findElements(By.cssSelector(".calendar__month"));
		for (int i=0; i < months.size(); i++) {
			if (driver.findElement(By.xpath("//*[@id='calendar']/div //*[@class='calendar__single-month active'][1]/div")).getText().contains(month)) {
				return driver.findElement(By.xpath("//*[@id='calendar']/div //*[@class='calendar__single-month active'][1]/div"));
			}
			else {
				driver.findElement(By.cssSelector(".calendar-nav__next")).click();
			}
		}
		return null;
	}
	
	public WebElement navigateDate(WebDriver driver, String date) {		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"calendar\"]/div //*[@class='calendar__single-month active'][1]/div[3]/div/a"));
		for (int d = 1; d< dates.size(); d++) {		
			if (dates.get(d).getText().equals(date)) {
				return dates.get(d);
			}
		}
		return null;
	}
	
	public void selectDepCity(WebDriver driver, String city) throws InterruptedException {
		WebElement depCity = driver.findElement(By.xpath("//*[@aria-describedby='from0autoSuggestLabel']"));
		
		depCity.sendKeys(Keys.BACK_SPACE);
		depCity.sendKeys(city);
		
		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
		act.keyDown(depCity, Keys.SHIFT).sendKeys(city).keyDown(depCity, Keys.SHIFT).build().perform();
		depCity.sendKeys(Keys.ENTER);
	}
	
	public void selectArrCity(WebDriver driver, String city) throws InterruptedException {
		WebElement arrCity = driver.findElement(By.xpath("//*[@aria-describedby='to0autoSuggestLabel']"));
		
//		arrCity.sendKeys(Keys.BACK_SPACE);
//		arrCity.sendKeys(city);
//		
//		List<WebElement> cityList = driver.findElements(By.xpath("//div[@class='row']/div[2]/div/section/div/ul/li"));
//		for (int i = 2; i < cityList.size(); i++ ) {
//			if (cityList.get(i).getText().toLowerCase().contains(city.toLowerCase())) {
//				return cityList.get(i);
//			}
//		}
//		return null;
//		Actions act = new Actions(driver);
//		
//		act.doubleClick().build().perform();
//		act.keyDown(arrCity, Keys.SHIFT).sendKeys(city).keyDown(arrCity, Keys.SHIFT).build().perform();
//		arrCity.sendKeys(Keys.ENTER);
		arrCity.sendKeys(city);
		List<WebElement> cityList = driver.findElements(By.xpath("//*[@id='to0autoSuggestLabel']/following-sibling::div/ul/li/span/span"));
		for (int i = 0; i < cityList.size(); i++ ) {
			System.out.println(cityList.get(i).getText());
			if (cityList.get(i).getText().toLowerCase().contains(city.toLowerCase())) {
				cityList.get(i).click();
			}
		}
	}
	
	public WebElement selectNoOfPassengers(WebDriver driver, int nOfAdults) throws InterruptedException {
		
		driver.findElement(By.id("travellerButton")).click();
		WebElement nOfAdults_webElem = driver.findElement(By.id("lbladults"));
		for (int i = 1; i < nOfAdults; i++) {
			if (nOfAdults_webElem.getText().equals(String.valueOf(nOfAdults))) {
				break;
			}
			else if (Integer.parseInt(nOfAdults_webElem.getText()) < nOfAdults){
				driver.findElement(By.id("addadults")).click();
			}
			else if (Integer.parseInt(nOfAdults_webElem.getText()) > nOfAdults){
				driver.findElement(By.id("removeadults")).click();
			}
		}
		return driver.findElement(By.id("closeDialog"));
	}
	
	public WebElement getNoOfPassengers(WebDriver driver) {
		driver.findElement(By.id("travellerButton")).click();
		return driver.findElement(By.id("lbladults"));
	}
		
	public WebElement search(WebDriver driver) throws InterruptedException {
		return driver.findElement(By.id("searchNow"));
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Arijit\\Work\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cheapoair.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Selenium2 sel = new Selenium2();
		
		

		
		sel.selectDepCity(driver, "ATL");
		sel.selectArrCity(driver, "ORD");
		
		sel.selectDepart(driver).click();
		sel.navigateMonth(driver, "December");
		sel.navigateDate(driver, "20").click();
		
		sel.navigateMonth(driver, "January");
		sel.navigateDate(driver, "12").click();	
				
		sel.selectNoOfPassengers(driver, 2).click();
		System.out.println(sel.getNoOfPassengers(driver).getText());
		
		sel.search(driver).click();
		
		//driver.close();
	}

}
