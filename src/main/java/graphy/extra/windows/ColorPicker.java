package graphy.extra.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gui.MainWindow;

public class ColorPicker extends JDialog{
	
	public ColorPicker(Frame parent, boolean modal){
		super();
				
		//color picker		
		Color initialColor = Color.red;
	    Color newColor = JColorChooser.showDialog(null, "Color Picker", initialColor);
		
	}	
	
}

