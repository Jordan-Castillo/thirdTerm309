package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.WeightConversion;

public class WeightConversionTest {
	@Test
	public void KilosToPoundsTest() {
		WeightConversion weightConverter = new WeightConversion();
		assertEquals(2.204, weightConverter.KilosToPounds(1), .01);
	}
	@Test
	public void PoundsToKilosTest() {
		WeightConversion weightConverter = new WeightConversion();
		assertEquals(0.453, weightConverter.PoundsToKilos(1), .01);
	}
}
