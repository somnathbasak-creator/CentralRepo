package firstSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Development_Avecto\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jackapp-qa.konycloud.com/apps/JIBWebApp/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait =new WebDriverWait(driver, 30);
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("home_flxHeader_lblMenu")));
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("__loadingScreenDiv"))));
		
		//Thread.sleep(8000);
		
		driver.findElement(By.id("home_flxHeader_lblMenu")).click();
		
		
		
		
	}

}