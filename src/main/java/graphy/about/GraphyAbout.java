package graphy.about;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GraphyAbout extends JDialog{
	
	public GraphyAbout(/*Frame parent, String title,*/ boolean modal){
		super(/*parent, title, modal*/);
		setTitle("Graphy About");
		setVisible(true);
		
		setSize(600,400);
		//setLocationRelativeTo(parent);
		setLocation(null);
		
		JLabel label = new JLabel(new ImageIcon("images/authors.jpg"));
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(label);
		
		JTextArea textArea=new JTextArea();
		textArea.append("Autori: Bojan Čoka i Siniša Pejin\n");
		textArea.append("Broj Indeksa: AI10/2011 i AI4/2012\n");
		textArea.append("E-mail: bcoka@uns.ac.rs i sinisapejin@gmail.comm\n");
		textArea.setLineWrap(true);
		add(textArea,BorderLayout.CENTER);
		textArea.setEditable(false);
		add(label,BorderLayout.SOUTH);
		textArea.setBackground(Color.lightGray);
		setResizable(false);
		
		//close button
		JPanel buttonClose = new JPanel();
		JButton button = new JButton("Close");
		buttonClose.add(button);
		
		//action listener
		button.addActionListener(new CloseListener());
		getContentPane().add(buttonClose, BorderLayout.PAGE_END);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
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

