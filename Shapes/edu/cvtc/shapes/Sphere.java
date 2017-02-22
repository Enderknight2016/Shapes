/**
 * 
 */
package edu.cvtc.shapes;


/**
 * @author Nicholas
 *
 */
public class Sphere extends Shape implements Renderer {
// radius and pi conversion to float
	private float radius = 0;
	final float pi = (float)Math.PI;
	// class constructor
	public Sphere(Dialog messageBox,float radius) {
		super(messageBox);
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
		super.getMessageBox().show("This Cylinders dimensions are a radius of " + radius + " and a surface area of " + surfaceArea() + " and a volume of " + volume(), "Sphere");
	}

}
