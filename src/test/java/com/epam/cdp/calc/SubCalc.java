package com.epam.cdp.calc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalc extends Base{
	
	@Test	
	public void threeMinusTwo() {
		long rslt = calc.sub(3, 2);
		Assert.assertTrue(rslt==1, "There was an error");
	}

}
