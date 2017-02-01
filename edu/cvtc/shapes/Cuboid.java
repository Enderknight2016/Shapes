package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Nicholas
 *
 */
public class Cuboid extends Shape {
	// properties
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	//class constructor
	public Cuboid(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	// getters and setters
	public float getWidth(){
		return this.width;
	}
	public void setWidth(float width){
		this.width = width;
	}
	public float getHeight(){
		return this.height;
	}
	public void setHeight(float height){
		this.height = height;
	}
	public float getDepth(){
		return this.depth;
	}
	public void setDepth(float depth){
		this.depth = depth;
	}
// surface area constructor
	@Override
	public float surfaceArea() {
		float surfaceArea = 2 * height * width + 2 * depth * height + 2  * depth * width;
		if(surfaceArea >= 0){
			return surfaceArea;
		} else {
			return -1;
		}
	}
// volume constructor
	@Override
	public float volume() {
		float volume = height * width * depth;
		if(volume >= 0){
			return volume;
		}else{
			return -1;
		}
	}
	//render constructor for Cuboid
	@Override
	public void render() {
		if(volume() == -1 || surfaceArea() == -1){
			JOptionPane.showMessageDialog(null,"Negative Numbers have been detected please try again");
		}else{
			JOptionPane.showMessageDialog(null, "This Cuboids dimensions are a width of " + width + " and a height of " + height + " and a depth of " + depth + " and a surface area of " + surfaceArea() + " and a volume of " + volume());
		}
	}

}
