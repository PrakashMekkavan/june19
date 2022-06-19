package link;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupingg2 {

	 
	public class groupingg {
		 @Test(priority=1,groups="smoke")
			private void tc1() {
		System.out.println("tc 100....................");
			}
			@Test(priority=-1,groups="smoke" )
			public void tc2() {

				System.out.println("................tc200...........");
			}
			
			@Test(priority=5,groups="bug")
			public void tc3( ) {

				  System.out.println("......tc300................")	;
		}

	}


}