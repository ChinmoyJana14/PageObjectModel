package Framework.objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
	
	WebDriver driver;	
	public RediffLoginPageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//input[@title='Sign in']");
	By home = By.linkText("rediff.com");
	*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@title='Sign in']")
	WebElement signInButton;
	
	@FindBy(linkText = "rediff.com")
	WebElement home;
	
	
	public WebElement EmailID() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement SignIn() {
		return signInButton;
	}
	
	public WebElement Home() {
		return home;
	}
}
