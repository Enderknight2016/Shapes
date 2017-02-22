/**
 * 
 */
package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Nicholas
 *
 */
public class MessageBox implements Dialog {
	public MessageBox(){
		
		
		
	}
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		
		return JOptionPane.OK_OPTION;
	}
}
