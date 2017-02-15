package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Sphere;
import junitparams.Parameters;

public class SpheresUnitTests {

	@Test
	@Parameters({
		"2",
		"5",
		"7"
	})
	public void testSurfaceArea(float x) {
		Sphere sphere = new Sphere(x);
		float expected = 4 * x * x * (float)Math.PI;
		float actual = sphere.surfaceArea();
		assertEquals(expected,actual, 1e-8);
	}

	@Test
	@Parameters({
		"2",
		"5",
		"7"
	})
	public void testVolume(float x) {
		Sphere sphere = new Sphere(x);
		float expected = (4 / 3) * x * x * x * (float)Math.PI;
		float actual = sphere.volume();
		assertEquals(expected,actual, 1e-8);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere_illegalArgumentException() {
		new Sphere(-1);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere = new Sphere(8);
		float expected = 8;
		float actual = sphere.getRadius();
		assertEquals(expected,actual, 1e-8);

	}

}
