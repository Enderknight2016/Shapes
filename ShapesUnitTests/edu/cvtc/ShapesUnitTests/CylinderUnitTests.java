package edu.cvtc.ShapesUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.cvtc.shapes.Cylinder;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
@RunWith(JUnitParamsRunner.class)
public class CylinderUnitTests {

	@Test
	@Parameters({ "2,4", "5,7", "7,8" })
	public void testSurfaceArea(float x, float y) {
		Cylinder cylinder = new Cylinder(x, y);
		float expected = 2 * (float) Math.PI * y * y + (float) Math.PI * 2 * x * y;
		float actual = cylinder.surfaceArea();
		assertEquals(expected, actual, 1e-8);
	}

	@Test
	@Parameters({ "2,4", "5,7", "7,8" })
	public void testVolume(float x, float y) {
		Cylinder cylinder = new Cylinder(x, y);
		float expected = (float) Math.PI * y * y * x;
		float actual = cylinder.volume();
		assertEquals(expected, actual, 1e-8);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCylinder_IllegalArgumentException() {
		new Cylinder(-4, 6);
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder(4, 5);
		float expected = 4;
		float actual = cylinder.getHeight();
		assertEquals(expected, actual, 1e-8);
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder = new Cylinder(4, 5);
		float expected = 5;
		float actual = cylinder.getHeight();
		assertEquals(expected, actual, 1e-8);
	}

}
