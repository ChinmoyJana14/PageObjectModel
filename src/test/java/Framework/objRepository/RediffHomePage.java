package Framework.objRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;	
	public RediffHomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By search = By.id("srchword");
	By searchButton = By.xpath("//form[@name='srchform']/input[@class='newsrchbtn']");
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement SearchButton() {
		return driver.findElement(searchButton);
	}


}
