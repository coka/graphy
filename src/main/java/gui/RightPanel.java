package gui;

//import gui.panels.mouse.MouseListenerPanel;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RightPanel extends JPanel
{
  public RightPanel()
  {
    super();
    
     BoxLayout boxRight= new BoxLayout(this, BoxLayout.Y_AXIS);
	 this.setLayout(boxRight);
	 //JPanel panMouseListener=new MouseListenerPanel();     
	 
	 JButton btn1=new JButton();
	 btn1.setToolTipText("Button 1");
	 btn1.setPreferredSize(new Dimension(50, 150));	
	 //btn1.add(panMouseListener);
	 
	 JButton btn2=new JButton();
	 btn2.setToolTipText("Button 2");
	 btn2.setPreferredSize(new Dimension(50, 150));
	 
	 JButton btn3=new JButton();
	 btn3.setToolTipText("Button 3");	
	 btn3.setPreferredSize(new Dimension(50, 150));
	 
	 JButton btn4=new JButton();
	 btn4.setToolTipText("Button 4");
	 btn4.setPreferredSize(new Dimension(50, 150));
	 
	 JButton btn5=new JButton();
	 btn5.setToolTipText("Button 5");
	 btn5.setPreferredSize(new Dimension(50, 150));
	 
	 this.add(btn1);
	 this.add(btn2);
	 this.add(btn3);
	 this.add(btn4);
	 this.add(btn5);
    
  }
}
