package link;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class mano implements IRetryAnalyzer {
 

	int a=0,b=3;
		public boolean retry(ITestResult arg0) {

			if (a<b) {
				
				a++;
				return true;
			}
			
			return false;
		}

		
		
	}

