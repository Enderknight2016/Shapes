package edu.cvtc.ShapesUnitTests;

import org.junit.Test;

import edu.cvtc.shapes.ShapeFactory;

public class ShapeFactoryUnitTests {

	@Test
	public void testShapeFactory() {
		ShapeFactory testFactory = new ShapeFactory(new MessageBoxSub());
		testFactory.makeCuboid(1,1,1);
		testFactory.makeCylinder(1, 1);
		testFactory.makeSphere(1);
	}

}
