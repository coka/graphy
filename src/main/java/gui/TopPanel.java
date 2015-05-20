package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JToolBar;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.SwingConstants;
import java.net.URL;

public class TopPanel extends JPanel implements ActionListener
{
	//commands for buttons
	static final private String CLICK = "click";
	static final private String ABOUT = "about";
	
  public TopPanel()
  {	  	  
	  super(new BorderLayout());
	  //this.setFloatable(false);
	  
	  JToolBar TopPanel = new JToolBar(  );
	  TopPanel.setFloatable(false); 
	  
      addButtons(TopPanel);
      
      setPreferredSize(new Dimension(500, 50));
      add(TopPanel, BorderLayout.PAGE_START);
      add(TopPanel, BorderLayout.CENTER);  
      
      TopPanel.setRollover(true);
        
      this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	  
	  
  }

  protected void addButtons(JToolBar TopPanel) {	 
	  JButton button = null;
	  TopPanel.add(Box.createHorizontalStrut(5));
	  
	  //File
	  
	//New Diagram
       button = makeNavigationButton("New Diagram", CLICK, "New Diagram", "btn 1");     
       TopPanel.add(button);        
	 
	//Open
       button = makeNavigationButton("Open", CLICK, "Open", "btn 2");
       TopPanel.add(button);         
 	 
  	//Save
        button = makeNavigationButton("Save", CLICK, "Save", "btn 3");
        TopPanel.add(button);
        
    //Import Diagram
        button = makeNavigationButton("Import Diagram", CLICK, "Import Diagram", "btn 4");
        TopPanel.add(button);
            
    //Export Diagram
        button = makeNavigationButton("Export Diagram", CLICK, "Export Diagram", "btn 5");
        TopPanel.add(button);    
    
    //Close/Remove Diagram
        button = makeNavigationButton("Close Remove Diagram", CLICK, "Close/Remove Diagram", "btn 6");
        TopPanel.add(button);
        
        TopPanel.add(Box.createHorizontalStrut(13));      
        
        //Edit
        
    //Undo
        button = makeNavigationButton("Undo", CLICK, "Undo", "btn 7");
        TopPanel.add(button);
                
    //Redo
        button = makeNavigationButton("Redo", CLICK, "Redo", "btn 8");
        TopPanel.add(button);
               
    //Cut
        button = makeNavigationButton("Cut", CLICK, "Cut", "btn 9");
        TopPanel.add(button);     
        
    //Copy
        button = makeNavigationButton("Copy", CLICK, "Copy", "btn 10");
        TopPanel.add(button); 
        
    //Paste
        button = makeNavigationButton("Paste", CLICK, "Paste", "btn 11");
        TopPanel.add(button); 
        
    //Rotate Left
        button = makeNavigationButton("Rotate Left", CLICK, "Rotate Left", "btn 12");
        TopPanel.add(button); 
        
    //Rotate Right
        button = makeNavigationButton("Rotate Right", CLICK, "Rotate Right", "btn 13");
        TopPanel.add(button); 
        
    //Rename Diagram
        button = makeNavigationButton("Rename Diagram", CLICK, "Rename Diagram", "btn 14");
        TopPanel.add(button); 
        
    //Delete Element
        button = makeNavigationButton("Delete Element", CLICK, "Delete Element", "btn 9");
        TopPanel.add(button); 
        
        TopPanel.add(Box.createHorizontalStrut(13)); 
        
        //View
        
    //Zoom In
        button = makeNavigationButton("Zoom In", CLICK, "Zoom In", "btn 11");
        TopPanel.add(button);
        
    //Zoom Out
        button = makeNavigationButton("Zoom Out", CLICK, "Zoom Out", "btn 11");
        TopPanel.add(button);
        
        TopPanel.add(Box.createHorizontalStrut(13)); 
        
        //Window
        
      //Cascade Windows
        button = makeNavigationButton("Cascade Windows", CLICK, "Cascade Windows", "btn 11");
        TopPanel.add(button);
        
      //Tile Windows Vertically
        button = makeNavigationButton("Tile Windows Vertically", CLICK, "Tile Windows Vertically", "btn 11");
        TopPanel.add(button);
        
      //Tile Windows Horizontally
        button = makeNavigationButton("Tile Windows Horizontally", CLICK, "Tile Windows Horizontally", "btn 11");
        TopPanel.add(button);
        
      //Previous Window
        button = makeNavigationButton("Previous Window", CLICK, "Previous Window", "btn 11");
        TopPanel.add(button);
        
      //Next Window
        button = makeNavigationButton("Next Window", CLICK, "Next Window", "btn 11");
        TopPanel.add(button);
        
        TopPanel.add(Box.createHorizontalStrut(13)); 
        
        //Help
        
      //About
        button = makeNavigationButton("About", ABOUT, "About", "btn 11");
        TopPanel.add(button);
        
 } 
  
  protected JButton makeNavigationButton(String imageName, String actionCommand, String toolTipText, String altText) {
		
		JButton button = new JButton();
		button.setActionCommand(actionCommand);
		button.setToolTipText(toolTipText);
		button.addActionListener(this);		
		button.setPreferredSize(new Dimension(30, 30));
		button.setIcon(new ImageIcon("images/Top Panel/" + imageName + ".jpg", altText));

		return button;
  }
  
  public void actionPerformed(ActionEvent e) {
      String cmd = e.getActionCommand();
      
      // handles buttons with set action command 
      if (CLICK.equals(cmd)) { 
    	  JOptionPane.showMessageDialog(null, "Click!");
      } else if (ABOUT.equals(cmd)) {
    	  
      }
    }
  
  
  //END
}
