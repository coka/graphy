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

public class DiagramRename extends JDialog{
	
	public DiagramRename(Frame parent, boolean modal){
		super();
		setTitle("Rename Diagram");
		setVisible(true);
		
		setSize(300,130);
		setLocationRelativeTo(parent);		
		
		this.setLayout(new BorderLayout());
		
		//text
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Enter new document name:"));
		
		//input text area
		JPanel middlepanel = new JPanel();
		JTextField tf = new JTextField(30);
		middlepanel.add(tf);
		
		//buttons
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER));		
		
		JButton buttonRename = new JButton("Rename");
		JButton buttonCancel = new JButton("Cancel");			
		
		buttonCancel.addActionListener(new CloseListener());		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
				
		buttons.add(buttonRename);
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

