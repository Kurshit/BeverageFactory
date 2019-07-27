package com.tavisca.beveragefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;

public class OrderbeverageTest {
	
	
	
	
	@Test
	public void shouldReturnTotalBillForOneBeverageWithNoExclusion() {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Chaai";
		double expectedResult = 4.0;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}
	
	@Test
	public void shouldReturnTotalBillForOneBeverageWithWaterExclusion() {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Coffee,-Sugar";
		double expectedResult = 4.5;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}
	
	@Test
	public void shouldReturnTotalBillForOneBeverageWithWaterMilkExclusion() {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Chaai,-Sugar,-Milk";
		double expectedResult = 2.5;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}

}
