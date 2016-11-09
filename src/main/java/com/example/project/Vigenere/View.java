package com.example.project.Vigenere;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class View extends JFrame
{
	private Controller control;
    
	public View() {
		
		control = new Controller();
		
		JButton button = new JButton("Press me");
		button.addActionListener(control);
		
		getContentPane().add(button);

		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
