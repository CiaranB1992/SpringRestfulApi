package com.example.project.Vigenere;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

public class Controller extends JComponent implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Press me")){
			System.out.println("Hello");
		}
	}

}
