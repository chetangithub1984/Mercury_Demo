package com.Mercury_Launch;

import org.testng.annotations.Test;


public class Registration extends Base{

	Base base = new Base ();
	
	//@Test

	public void test() throws InterruptedException {
		

		
		base.getWebDriver();
		
		base.registration();
		Thread.sleep(2000);
		
		base.login();
		Thread.sleep(2000);
		
		base.flightBooking();

	}

	@Test

	public void fillForm() {
		base.getWebDriver();

		base.toolsQaformFillup();

	}

}
