package jUnitExercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTestClass {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int res = c.add(12, 3);
		assertEquals(15,res);
	}

}
