/**
 * 
 */
package edu.cvtc.shapes.test;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.Sphere;

/**
 * @author Nicholas
 *
 */
public class ShapesTest {

	/**
	 * Main function
	 */
	public static void main(String[] args) {
		//Test shapes
		Cuboid testCuboid = new Cuboid(15,35, 6);
		Cylinder testCylinder = new Cylinder(6,19);
		Sphere testSphere = new Sphere(9);
		// rendering of test shapes to message boxes
		testCuboid.render();
		testCylinder.render();
		testSphere.render();

	}

}
