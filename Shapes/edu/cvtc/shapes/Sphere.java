/**
 * 
 */
package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Nicholas
 *
 */
public class Sphere extends Shape {
// radius and pi conversion to float
	private float radius = 0;
	final float pi = (float)Math.PI;
	// class constructor
	public Sphere(float radius) {
		if (radius < 0){
			throw new IllegalArgumentException("radius should not be negative");
		}else{
			this.radius = radius;
		}
	}
	// getters and setters for sphere properties
	public float getRadius(){
		return this.radius;
	}
	public void setRadius(float radius){
		if (radius < 0){
			throw new IllegalArgumentException("radius should not be negative");
		}else{
			this.radius = radius;
		}
	}
	// surface area constructor
	@Override
	public float surfaceArea() {
		float surfaceArea = radius * radius * 4 * pi;
		return surfaceArea;
	}
// volume constructor
	@Override
	public float volume() {
		float volume = radius * radius * radius * (4 / 3) * pi;
		return volume;
	}
	//render constructor for sphere
	@Override
	public void render() {
		
		JOptionPane.showMessageDialog(null, "This Cylinders dimensions are a radius of " + radius + " and a surface area of " + surfaceArea() + " and a volume of " + volume());
	}

}
