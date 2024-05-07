package pagepgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBDataDrivenPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="pass")
	WebElement Password;
	@FindBy(name="login")
	WebElement Login;
	
public FBDataDrivenPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
public void Logindetails(String UN,String Pass) {
	Email.sendKeys(UN);
	Password.sendKeys(Pass);
}

public void LoginClick() {
	Login.click();
}
}
