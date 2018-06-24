package com.epam.cdp.calc;
import org.testng.Assert;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;


public class SumCalc  extends Base{
	
	protected Calculator calc;
	
	
	@Test (dataProvider = "valuesSum", expectedExceptions = NullPointerException.class)
	public void plus (long a, long b, long expectedValue) {
		
		long result = calc.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid input");
		
	}
	
	@DataProvider(name = "valuesSum")
		
		public Object [][] valuesSum(){
			return new Object[][] {
				{2, 5, 7},
				{-4, 5, 1},
				{0, 0, 0},
				{-4, 0, -4}
			};
		}
	
}
