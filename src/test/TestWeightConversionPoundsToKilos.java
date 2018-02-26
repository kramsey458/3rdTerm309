package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.WeightConversion;

public class TestWeightConversionPoundsToKilos {

	@Test
	public void TestKilosToPounds() {
		WeightConversion converter = new WeightConversion();
		double result = converter.KilosToPounds(100);
		assertEquals((double)220.462, result, 0.5);
	}

}
