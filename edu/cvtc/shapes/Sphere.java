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
		this.radius = radius;
	}
	// getters and setters for sphere properties
	public float getRadius(){
		return this.radius;
	}
	public void setRadius(float radius){
		this.radius = radius;
	}
	// surface area constructor
	@Override
	public float surfaceArea() {
		float surfaceArea = radius * radius * 4 * pi;
		if(surfaceArea >= 0){
			return surfaceArea;
		} else {
			return -1;
		}
	}
// volume constructor
	@Override
	public float volume() {
		float volume = radius * radius * radius * (4 / 3) * pi;
		if(volume >= 0){
			return volume;
		} else{
			return -1;
		}
	}
	//render constructor for sphere
	@Override
	public void render() {
		if(volume() == -1 || surfaceArea() == -1){
			JOptionPane.showMessageDialog(null,"Negative Numbers have been detected please try again");
		}else{
			JOptionPane.showMessageDialog(null, "This Cylinders dimensions are a radius of " + radius + " and a surface area of " + surfaceArea() + " and a volume of " + volume());
		}
	}

}
