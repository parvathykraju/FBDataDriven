package testpgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pagepgm.FBDataDrivenPage;
import utilityPGM.ExcelFBUtility;

public class FBDataDrivenTest {

	public static WebDriver driver;
	String URL="https:www.facebook.com";
	@BeforeTest
	public void SetUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	
	
	@org.testng.annotations.Test
	public void Test() {
	FBDataDrivenPage fb=new FBDataDrivenPage(driver);
	
	String Excelpath="C:\\Users\\VK_Personal\\OneDrive\\Documents\\java\\Facebook.xlsx";
	String Sheet="Sheet1";
	
	int r=ExcelFBUtility.getRowCount(Excelpath,"Sheet1");
	
	for(int i=0;i<=r;i++) {
		String Username=ExcelFBUtility.inputString(Excelpath,Sheet,i,0 );
		String Password=ExcelFBUtility.inputString(Excelpath,Sheet,i,1 );
		fb.Logindetails(Username,Password);
		fb.LoginClick();
	}
	
}}
