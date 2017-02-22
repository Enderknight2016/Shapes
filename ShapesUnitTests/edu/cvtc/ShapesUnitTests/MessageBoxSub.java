/**
 * 
 */
package edu.cvtc.ShapesUnitTests;

import edu.cvtc.shapes.Dialog;

/**
 * @author Nicholas
 *
 */
public class MessageBoxSub implements Dialog {
	MessageBoxSub(){
		
	}
	@Override
	public int show(String message, String title) {
		return 0;
	}

}
