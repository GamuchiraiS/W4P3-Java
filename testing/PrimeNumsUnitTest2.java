package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumsUnitTest2 {

	@Test
	public void PrimeNumsTest2() {
		//Arrange 
		int numTest = 97; 
		boolean expectedResult = true; 
		boolean actualResult;
		PrimeNums pm = new PrimeNums(numTest);
		
		//Act
		actualResult = pm.IsPrimeNum(numTest);
		
		//Assert
		assertTrue("Calculation was incorrect", actualResult == expectedResult);
	}

}
