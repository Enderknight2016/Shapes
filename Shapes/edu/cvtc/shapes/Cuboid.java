package edu.cvtc.shapes;



/**
 * @author Nicholas
 *
 */
public class Cuboid extends Shape implements Renderer {
	// properties
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	//class constructor
	public Cuboid(Dialog messageBox, float width, float height, float depth ) {
		super(messageBox);
		if (width < 0 || height < 0 || depth < 0){
			throw new IllegalArgumentException("parameters cannot be negative.");
			
		}else{
			
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
		
	}
	// getters and setters
	public float getWidth(){
		return this.width;
	}
	public void setWidth(float width){
		if(width < 0) {
			throw new IllegalArgumentException("width cannot be negative.");
		} else{
			this.width = width;
		}
	}
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
	public float getDepth(){
		return this.depth;
	}
	public void setDepth(float depth){
		if(depth < 0) {
			throw new IllegalArgumentException("depth cannot be negative.");
		} else{
			this.depth = depth;
		}
	}
// surface area constructor
	@Override
	public float surfaceArea() {
		float surfaceArea = 2 * height * width + 2 * depth * height + 2  * depth * width;
			return surfaceArea;
	}
// volume constructor
	@Override
	public float volume() {
		float volume = height * width * depth;
			return volume;
		
	}
	//render constructor for Cuboid
	@Override
	public void render() {
		super.getMessageBox().show("This Cuboids dimensions are a width of " + width + " and a height of " + height + " and a depth of " + depth + " and a surface area of " + surfaceArea() + " and a volume of " + volume(), "Cuboid");
	}

}
