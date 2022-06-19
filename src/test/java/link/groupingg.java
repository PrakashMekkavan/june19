package link;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupingg {
		 @Test(priority=2,groups= {"fix","smoke"})
			public void tc1() {
		System.out.println("tc 10...................."+Thread.currentThread().getName());
			}
			@Test(priority=8,groups="fix" )
			public void tc2() {

				System.out.println("................tc20..........."+Thread.currentThread().getName());
			}
			
			@Test(priority=4,groups="bug")
			public void tc3( ) {

				  System.out.println("......tc300................")	;
	}

}
