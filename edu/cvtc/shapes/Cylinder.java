/**
 * 
 */
package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Nicholas
 *
 */
public class Cylinder extends Shape {
// height, radius, and pi converted to float
	private float height = 0;
	private float radius = 0;
	final float pi = (float)Math.PI;
	// class constructor
	public Cylinder(float height, float radius) {
		this.height = height;
		this.radius = radius;
	}
	// getters and setters for cylinder properties
	public float getHeight(){
		return this.height;
	}
	public void setHeight(float height){
		this.height = height;
	}
	public float getRadius(){
		return this.radius;
	}
	public void setRadius(float radius){
		this.radius = radius;
	}
	//surface area constructor
	@Override
	public float surfaceArea() {
		float surfaceArea = 2 * pi * radius * height + 2 * pi * radius * radius;
		if(surfaceArea >= 0){
			return surfaceArea;
		} else {
			return -1;
		}
	}
	// volume constructor
	@Override
	public float volume() {
		float volume = 2 * pi * radius * radius * height;
		if(volume >= 0) {
			return volume;
		} else{
			return -1;
		}
		
	}
	// render constructor for cylinder
	@Override
	public void render() {
		if(volume() == -1 || surfaceArea() == -1){
			JOptionPane.showMessageDialog(null,"Negative Numbers have been detected please try again");
		}else{
			JOptionPane.showMessageDialog(null, "This Cylinders dimensions are a radius of " + radius + " and a height of " + height + " and a surface area of " + surfaceArea() + " and a volume of " + volume());
		}
	}

}
