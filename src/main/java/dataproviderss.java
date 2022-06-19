import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderss {

	@Test(dataProvider="may")
	public void Axis(String a,String b) {

		System.out.println("username"+a);
		System.out.println("username"+b);
	}
	@DataProvider(name="may")
	public   static  Object[][]inpuk()
	{
		return new Object[][]{
		{"user1","1234"},
		{"user22","ashh"}}; 
		
	}
	}
