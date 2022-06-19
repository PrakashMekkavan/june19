import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class march1222 implements IAnnotationTransformer{

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer ra = arg0.getRetryAnalyzer();
		System.out.println(ra);
		if (ra==null) {
			
			arg0.setRetryAnalyzer(march122.class);
		}
	}
	
 
}
