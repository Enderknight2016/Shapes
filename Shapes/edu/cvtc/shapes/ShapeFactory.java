/**
 * 
 */
package edu.cvtc.shapes;

/**
 * @author Nicholas
 *
 */
public class ShapeFactory {
private Dialog dialog;
public Dialog getDialog(){
	return dialog;
}
public void setDialog(Dialog dialog){
	this.dialog = dialog;
}
public ShapeFactory(Dialog dialog){
	this.dialog =dialog;
}
public Cuboid makeCuboid(float height, float width, float depth){
	
	return new Cuboid(dialog, height, width, depth);
	
}
public Cylinder makeCylinder(float height, float radius){
	return new Cylinder(dialog, height, radius);
	
}
public Sphere makeSphere(float radius){
	return new Sphere(dialog, radius);
}
}
