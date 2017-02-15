/**
 * 
 */
package edu.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junitparams.Parameters;
import edu.cvtc.shapes.Cuboid;

/**
 * @author Nicholas
 *
 */
public class CuboidUnitTests {

	/**
	 * Test method for {@link edu.cvtc.shapes.Cuboid#surfaceArea()}.
	 */
	@Test
	@Parameters({
		"2,4,5",
		"5,7,9",
		"7,8,10"
	})
	public void testSurfaceArea(float x, float y, float z) {
		Cuboid cuboid = new Cuboid(x,y,z);
		float expected = 2 * x * y + 2 * y * z + 2 * z * x;
		float actual = cuboid.surfaceArea();
		assertEquals(expected,actual, 1e-8);
	}

	/**
	 * Test method for {@link edu.cvtc.shapes.Cuboid#volume()}.
	 */
	@Test
	@Parameters({
		"2,4,5",
		"5,8,9",
		"7,8,10"
	})
	public void testVolume(float x, float y, float z) {
		Cuboid cuboid = new Cuboid(x,y,z);
		float expected = x * y * z;
		float actual = cuboid.volume();
		assertEquals(expected,actual, 1e-8);
	}

	/**
	 * Test method for {@link edu.cvtc.shapes.Cuboid#Cuboid(float, float, float)}. and illegal argument exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCuboid_IllegalArgument() {
			new Cuboid(-1,3,6);	
	}

	/**
	 * Test method for {@link edu.cvtc.shapes.Cuboid#getWidth()}.
	 */
	@Test
	public void testGetWidth() {
		Cuboid cuboid = new Cuboid(1,1,1);
		float expected = 1;
		float actual = cuboid.getWidth();
		assertEquals(expected,actual, 1e-8);
	}

	/**
	 * Test method for {@link edu.cvtc.shapes.Cuboid#getHeight()}.
	 */
	@Test
	public void testGetHeight() {
		Cuboid cuboid = new Cuboid(1,1,1);
		float expected = 1;
		float actual = cuboid.getHeight();
		assertEquals(expected,actual, 1e-8);
	}

	

	/**
	 * Test method for {@link edu.cvtc.shapes.Cuboid#getDepth()}.
	 */
	@Test
	public void testGetDepth() {
		Cuboid cuboid = new Cuboid(1,1,1);
		float expected = 1;
		float actual = cuboid.getDepth();
		assertEquals(expected,actual, 1e-8);
	}

	

}
