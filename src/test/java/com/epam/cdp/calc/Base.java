package com.epam.cdp.calc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

public class Base {
	
	
	protected Calculator calc;
	
	@BeforeClass	
	public void setUp() {
		
		calc = new Calculator();
		
	}
	@AfterClass	
	public void clear() {
		calc = null;
	} 
	

}
