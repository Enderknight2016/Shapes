/**
 * 
 */
package edu.cvtc.shapes;



/**
 * @author Nicholas
 *
 */
abstract public class Shape {
	private Dialog messageBox;
	// The abstract surface area of the super class
	public abstract float surfaceArea();
	// The abstract volume of the the shape super class
	public abstract float volume();
	public Dialog getMessageBox() {
		return this.messageBox;
	}
	public void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	public Shape(Dialog messageBox){
		this.messageBox = messageBox;
	}

}