package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumsUnitTest1 {

	@Test
	public void PrimeNumsTest1() {
		//Arrange 
		int numTest = 52; 
		boolean expectedResult = false; 
		boolean actualResult;
		PrimeNums pm = new PrimeNums(numTest);
		
		//Act
		actualResult = pm.IsPrimeNum(numTest);
		
		//Assert
		assertTrue("Calculation was incorrect", actualResult == expectedResult);
	}

}
