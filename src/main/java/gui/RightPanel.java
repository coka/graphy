package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JToolBar;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.SwingConstants;

import actions.PlaceholderAction;
import actions.RectangleStateAction;

import java.net.URL;

public class RightPanel extends JPanel implements ActionListener
{	
	//commands for buttons
	static final private String CLICK = "click";
	
  public RightPanel()
  {   	  
	  super(new BorderLayout());
	 
	  JToolBar RightPanel = new JToolBar("Graphics Pallete");
	  RightPanel.setOrientation(SwingConstants.VERTICAL);
      addButtons(RightPanel);
      
      setPreferredSize(new Dimension(60, 300));
      add(RightPanel, BorderLayout.PAGE_START);
      add(RightPanel, BorderLayout.CENTER);  
      
      RightPanel.setRollover(true);
        
      this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));    
  }
      
  protected void addButtons(JToolBar RightPanel) {	 
	  JButton button = null;
	  RightPanel.add(Box.createVerticalStrut(10));
	  
	//first button
       button = makeNavigationButton("Button 1", CLICK, "Button 1", "btn 1");     
       RightPanel.add(button);      
       RightPanel.add(Box.createVerticalStrut(10));
	 
	//second button
       button = makeNavigationButton("Button 2", CLICK, "Button 2", "btn 2");
       RightPanel.add(button);    
	   RightPanel.add(Box.createVerticalStrut(10));
 	 
  	//third button
        button = makeNavigationButton("Button 3", CLICK, "Button 3", "btn 3");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));
        
    //fourth button
        button = makeNavigationButton("Button 4", CLICK, "Button 4", "btn 4");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10)); 
        
    //fifth button
        button = makeNavigationButton("Button 5", CLICK, "Button 5", "btn 5");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10)); 
    
    //sixth button
        button = makeNavigationButton("Button 6", CLICK, "Button 6", "btn 6");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));  
        
    //seventh button
        button = rectangleStateButton("Button 7", CLICK, "Button 7", "btn 7");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10)); 
        
    //eight button
        button = makeNavigationButton("Button 8", CLICK, "Button 8", "btn 8");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10)); 
        
    //ninth button
        button = makeNavigationButton("Button 9", CLICK, "Button 9", "btn 9");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10)); 
 } 
  
  protected JButton makeNavigationButton(String imageName, String actionCommand, String toolTipText, String altText) {
		
	  PlaceholderAction action = new PlaceholderAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg", altText));
	  JButton button = new JButton(action);
	  button.setText("");
		button.setToolTipText(toolTipText);
		button.setPreferredSize(new Dimension(30, 30));

		return button;
  }

  protected JButton rectangleStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

    RectangleStateAction action = new RectangleStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
    JButton button = new JButton(action);
    button.setText("");
    button.setToolTipText(toolTipText);
    button.setPreferredSize(new Dimension(30, 30));

    return button;
  }
  
  public void actionPerformed(ActionEvent e) {
      String cmd = e.getActionCommand();
      
      // handles buttons with set action command 
      if (CLICK.equals(cmd)) { 
    	  JOptionPane.showMessageDialog(null, "Click!");
      } 
  }
  
  //END
}
  
