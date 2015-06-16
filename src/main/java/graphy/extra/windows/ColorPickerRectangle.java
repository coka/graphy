package graphy.extra.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gui.MainWindow;

public class ColorPickerRectangle extends JDialog{
	
	public ColorPickerRectangle(Frame parent, boolean modal){
		super();
		setTitle("Rectangle Color Picker");
		setVisible(true);
		
		setSize(300,130);
		setLocationRelativeTo(parent);		
		
		this.setLayout(new BorderLayout());
		
		//text
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Choose Rectangle Color"));
		
		//color picker
		JPanel middlepanel = new JPanel();		
		middlepanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton redBtn = new JButton("Red");
		redBtn.setBackground(Color.red);
		redBtn.setContentAreaFilled(false);
		redBtn.setOpaque(true);
		
		JButton greenBtn = new JButton("Green");
		greenBtn.setBackground(Color.green);
		greenBtn.setContentAreaFilled(false);
		greenBtn.setOpaque(true);
		
		JButton blueBtn = new JButton("Blue");
		blueBtn.setBackground(Color.blue);
		blueBtn.setContentAreaFilled(false);
		blueBtn.setOpaque(true);
		
		middlepanel.add(redBtn);
		middlepanel.add(greenBtn);
		middlepanel.add(blueBtn);
		
		//buttons
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER));		
		
		JButton buttonCancel = new JButton("Cancel");			
				
		buttonCancel.addActionListener(new CloseListener());		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);						
	
		buttons.add(buttonCancel);
		
		this.add(topPanel, BorderLayout.NORTH);
		this.add(middlepanel, BorderLayout.CENTER);
		this.add(buttons, BorderLayout.SOUTH);
				
		ImageIcon img = new ImageIcon("images/Logo.png");
	    this.setIconImage(img.getImage());
		
	}
	
	class CloseListener implements ActionListener {
		 public void actionPerformed(ActionEvent e) {
			 setVisible(false);
			 dispose();
		 }
	}
}

