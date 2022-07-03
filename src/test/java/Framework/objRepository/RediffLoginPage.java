package Framework.objRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;	
	public RediffLoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//input[@title='Sign in']");
	By home = By.linkText("rediff.com");
	
	public WebElement EmailID() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement SignIn() {
		return driver.findElement(signInButton);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
	}
}
