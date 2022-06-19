package link;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelex {

	WebDriver dr;
	@Parameters({"brow"})
	@Test
	private void testcase(String str) {

		if (str.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			dr= new ChromeDriver();
		}else if (str.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			dr= new EdgeDriver();
		}
		
	}
}
