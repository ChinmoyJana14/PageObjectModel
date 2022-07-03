package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Framework.objRepository.RediffHomePage;
import Framework.objRepository.RediffHomePageFactory;
import Framework.objRepository.RediffLoginPage;
import Framework.objRepository.RediffLoginPageFactory;

public class Loginapplication {
	
	static WebDriverWait wait; 

	
	//@Test
	public void Login() {		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();	
		RediffLoginPage rediffLoginPage = new RediffLoginPage(driver); 
		rediffLoginPage.EmailID().sendKeys("Hello");
		rediffLoginPage.Password().sendKeys("Hello");
		rediffLoginPage.SignIn().click();
		wait.until(ExpectedConditions.elementToBeClickable(rediffLoginPage.Home())).click();
		RediffHomePage rh = new RediffHomePage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(rh.Search())).sendKeys("Chinmoy");
		rh.SearchButton().click();
		driver.quit();
	}
	
	@Test
	public void LoginWithFactory(){		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Grid\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-site-isolation-trials");
		WebDriver driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();			
		RediffLoginPageFactory rediffLoginPage = new RediffLoginPageFactory(driver); 
		rediffLoginPage.EmailID().sendKeys("Hello");
		rediffLoginPage.Password().sendKeys("Hello");
		rediffLoginPage.SignIn().click();
		wait.until(ExpectedConditions.elementToBeClickable(rediffLoginPage.Home())).click();
		RediffHomePageFactory rh = new RediffHomePageFactory(driver);
		wait.until(ExpectedConditions.elementToBeClickable(rh.Search())).sendKeys("Chinmoy");
		rh.SearchButton().click();
		driver.quit();
	}

}
