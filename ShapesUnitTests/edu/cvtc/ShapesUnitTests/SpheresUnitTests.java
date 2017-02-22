/**
 * 
 */
package edu.cvtc.ShapesUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import edu.cvtc.shapes.Dialog;
import edu.cvtc.shapes.Sphere;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author Nicholas
 *
 */
@RunWith(JUnitParamsRunner.class)
public class SpheresUnitTests {

	@Test
	@Parameters({ "2", "5", "7" })
	public void testSurfaceArea(float x) {
		Sphere sphere = new Sphere(null,x);
		float expected = 4 * x * x * (float) Math.PI;
		float actual = sphere.surfaceArea();
		assertEquals(expected, actual, 1e-8);
	}

	@Test
	@Parameters({ "2", "5", "7" })
	public void testVolume(float x) {
		Sphere sphere = new Sphere(null,x);
		float expected = (4 / 3) * x * x * x * (float) Math.PI;
		float actual = sphere.volume();
		assertEquals(expected, actual, 1e-8);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSphere_illegalArgumentException() {
		new Sphere(null,-1);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere = new Sphere(null,8);
		float expected = 8;
		float actual = sphere.getRadius();
		assertEquals(expected, actual, 1e-8);

	}
	@Test
	public void testRender() {
		Dialog messageBox = new MessageBoxSub();
		Sphere sphere = new Sphere(messageBox,7);
		int expected = 0;
		int actual = sphere.getMessageBox().show("example", "example");
		assertEquals(expected,actual);
	}

}
