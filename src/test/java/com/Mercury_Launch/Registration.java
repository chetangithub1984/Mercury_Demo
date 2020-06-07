package com.Mercury_Launch;

import org.testng.annotations.Test;


public class Registration extends Base{
	
	@Test

	public void test() throws InterruptedException {
		
		Base base = new Base ();
		
		base.getWebDriver();
		
		base.registration();
		Thread.sleep(2000);
		
		base.login();
		Thread.sleep(2000);
		
		base.flightBooking();

	}

}
