/**
 * 
 */
package edu.cvtc.shapes;


/**
 * @author Nicholas
 *
 */
public class Cylinder extends Shape implements Renderer{
// height, radius, and pi converted to float
	private float height = 0;
	private float radius = 0;
	final float pi = (float)Math.PI;
	// class constructor
	public Cylinder(Dialog messageBox, float height, float radius) {
		super(messageBox);
		if (height < 0 || radius < 0){
			throw new IllegalArgumentException("Parameter cannot be negative");
		} else {
			
			this.height = height;
			this.radius = radius;
		}
	}
	// getters and setters for cylinder properties
	public float getHeight(){
		return this.height;
	}
	public void setHeight(float height){
		if(height < 0) {
			throw new IllegalArgumentException("height cannot be negative.");
		} else{
			this.height = height;
		}
	}
	public float getRadius(){
		return this.radius;
	}
	public void setRadius(float radius){
		if(radius < 0) {
			throw new IllegalArgumentException("radius cannot be negative.");
		} else{
			this.radius = radius;
		}
	}
	//surface area constructor
	@Override
	public float surfaceArea() {
		float surfaceArea = 2 * pi * radius * height + 2 * pi * radius * radius;
			return surfaceArea;
	}
	// volume constructor
	@Override
	public float volume() {
		float volume = pi * radius * radius * height;
			return volume;
		
	}
	// render constructor for cylinder
	@Override
	public void render() {
		super.getMessageBox().show("This Cylinders dimensions are a radius of " + radius + " and a height of " + height + " and a surface area of " + surfaceArea() + " and a volume of " + volume(), "Cylinder");
	}

}
