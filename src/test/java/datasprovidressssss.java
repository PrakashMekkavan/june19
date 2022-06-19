import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datasprovidressssss {
	WebDriver dr;
	@BeforeMethod
	public   void beforeclass() {

		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
	}
	
	@AfterMethod
	 public void aftercmethod() {
 dr.close();
	}
	
	@Test(dataProvider="sampledata",dataProviderClass=datasproviderss.class)
	public void MainFunction(String email,String pass) {
WebElement txtusr = dr.findElement(By.id("id"));
txtusr.sendKeys(email);
WebElement txtpass = dr.findElement(By.id("pass"));
txtpass.sendKeys(pass);
WebElement btnlog = dr.findElement(By.name("login"));
btnlog.click();
	}
	
@DataProvider(name="sampledata")
	public Object[][] dd(){
	return new Object[][]{
	{"user1","test123"},
	{"user2","test123"},
	{"user3","test123"},
	{"user4","test123"}};
		
		
		
		
		
		
		
		
	}


}
