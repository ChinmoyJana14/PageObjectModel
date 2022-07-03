package Framework.objRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePageFactory {
	
	WebDriver driver;	
	public RediffHomePageFactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By search = By.id("srchword");
//	By searchButton = By.xpath("//form[@name='srchform']/input[@class='newsrchbtn']");
	
	@FindBy(id = "srchword")
	WebElement search;
	
	@FindBy(xpath = "//form[@name='srchform']/input[@class='newsrchbtn']")
	WebElement searchButton;
	
	public WebElement Search() {
		return search;
	}
	
	public WebElement SearchButton() {
		return searchButton;
	}


}
