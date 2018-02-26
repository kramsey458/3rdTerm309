package test;

import static org.junit.Assert.*;


import org.junit.Test;
import logic.WeightConversion;

public class TestWeightConversionKilosToPounds {

	@Test
	public void TestPoundsToKilos() {
		WeightConversion converter = new WeightConversion();
		double result = converter.PoundsToKilos(100);
		assertEquals((double)45.3592, result, 0.1);
	}

}
