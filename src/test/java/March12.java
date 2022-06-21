import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.util.RetryAnalyzerCount;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class March12 {
 
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.javatpoint.com/javascript-comment");
	JavascriptExecutor j= (JavascriptExecutor)driver;
     WebElement usrname = driver.findElement(By.xpath("//h2[text()='Learn Latest Tutorials']"));
	j.executeScript("arguments[0].scrollIntoView()",usrname);
	
}}