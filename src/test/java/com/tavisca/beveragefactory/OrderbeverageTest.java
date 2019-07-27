package com.tavisca.beveragefactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;

public class OrderbeverageTest {
	
	
	
	
	@Test
	public void shouldReturnTotalBillForOneBeverageWithNoExclusion() throws Exception {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Chaai";
		double expectedResult = 4.0;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}
	
	@Test
	public void shouldReturnTotalBillForOneBeverageWithWaterMilkExclusion() throws Exception {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Chaai,-Sugar,-Milk";
		double expectedResult = 2.5;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}
	
	@Test
	public void shouldReturnTotalBillForOneBeverageWithWaterExclusion() throws Exception {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Coffee,-Sugar";
		double expectedResult = 4.5;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}
	
	@Test
	public void shouldReturnTotalBillForTwoUniqueBeverageWithOneExclusion() throws Exception {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Chaai,-Sugar,Coffee";
		double expectedResult = 8.5;
		double actualResult = underTest.totalBill(input1);
		
		assertEquals(expectedResult, actualResult, 0);		
		
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowExceptionIfAllIngedientsRemoved() throws Exception {
		OrderBeverage underTest = new OrderBeverage();
		String input1 = "Chaai,-Sugar,-Milk,-Tea,-Water";
		double expectedResult = 8.5;
		double actualResult = underTest.totalBill(input1);			
		
	}
	
	
	
	
	

}
