import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class march122 implements IRetryAnalyzer {
int a=0,b=3;
	public boolean retry(ITestResult arg0) {

		if (a<b) {
			
			a++;
			return true;
		}
		
		return false;
	}

	
	
}
