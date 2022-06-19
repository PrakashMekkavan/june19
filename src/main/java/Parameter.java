import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {

	@Test
	@Parameters({"tamil"  })
	public void hdfc(@Optional("varadhaa") String s  ) {
    WebDriverManager.chromedriver().setup();
		//WebDriver dr= new ChromeDriver();
	//	dr.get("https://www.facebook.com/");
		//WebElement usr = dr.findElement(By.id("email"));
		//usr.sendKeys(s);
	//	usr.sendKeys(w);
		System.out.println(s);
//		System.out.println("......"+s);
		
	}
	
	
}
