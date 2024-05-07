package testpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepgm.SauceDemoPage;
import utilityPGM.ExcelFBUtility;

public class SauceDemoTest {

	public static WebDriver driver;
	
	
	@BeforeTest
		public void SetUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
@BeforeMethod
	
	public void beforecall() {
	driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	
	public void TestSauce() throws InterruptedException {
		
		SauceDemoPage ob=new SauceDemoPage(driver);
/*		String Excelpath="C:\\Users\\VK_Personal\\OneDrive\\Documents\\java\\SauceDemo.xlsx";
		String Sheet="Sheet1";
		
		int r=ExcelFBUtility.getRowCount(Excelpath,"Sheet1");
		System.out.println("The number of rows are ="+r);
		for(int i=1;i<=r;i++) {
			String Username=ExcelFBUtility.inputString(Excelpath,Sheet,i,0 );
			String Password=ExcelFBUtility.inputString(Excelpath,Sheet,i,1 );
			
			System.out.println("The username is="+Username);
			System.out.println("The password is="+Password);
			ob.Loginapp(Username,Password);
			*/
			ob.Loginapp("standard_user","secret_sauce");
			
			if(driver.getPageSource().contains("Login")) {
				ob.Username.clear();
			
				System.out.println("username after clear"+ob.Username.getText());
				Thread.sleep(1000);
				ob.Password.clear();
				System.out.println("Password after clear"+ob.Password.getText());
			}
			
				
		
		
		
		ob.AddItems();
		ob.CheckOutitems();
		ob.BackTohomepage();
	}
}
