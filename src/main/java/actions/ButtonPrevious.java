package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class ButtonPrevious extends AbstractAction{	
	
	public ButtonPrevious(ImageIcon icon)
	  {
	    super("Previous Window", icon);	    
	  }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		MainWindow.centerPanel.selectFrame(false);		
	}
}

