package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-al-your-account']/a[4]/span")));
		
		driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[4]/span")).click();
	}

}
