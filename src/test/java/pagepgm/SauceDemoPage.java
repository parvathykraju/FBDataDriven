package pagepgm;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Exit;

public class SauceDemoPage {

	WebDriver driver;
	
	@FindBy(id="user-name")
	public
	WebElement Username;
	@FindBy(id="password")
	public
	WebElement Password;
	@FindBy(id="login-button")
	WebElement Login;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement FirstItem;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement SecondItem;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement ThirdItem;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement FourthItem;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement FifthItem;
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement SixthItem;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement Cart;
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement CheckOut;
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement FirstName;
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement LastName;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement ZipCode;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement Continue;
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement Finish;
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement BackToHomeLink;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement Menu;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement Logout;
	
	public SauceDemoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void Loginapp(String UN,String PW) throws InterruptedException{
		String parentWind=driver.getWindowHandle();
		driver.getTitle();
		Username.sendKeys(UN);
		Thread.sleep(1000);
		Password.sendKeys(PW);
		Login.click();
		
	}
	
	public void AddItems() {
		FirstItem.click();
		SecondItem.click();
		ThirdItem.click();
		FourthItem.click();
		FifthItem.click();
		SixthItem.click();
		Cart.click();
		
}
	
	public void CheckOutitems() {
		CheckOut.click();
		FirstName.sendKeys("Firstname");
		LastName.sendKeys("LastName");
		ZipCode.sendKeys("688543");
		Continue.click();
		Finish.click();
	}
	
	public void BackTohomepage() {
		BackToHomeLink.click();
		Menu.click();
		Logout.click();
		
		}
	

	
//		Alert alert=driver.switchTo().alert().accept();
		
	
	
	
}
