package gui.listeners.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class RightPanelListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		if (arg0.getClickCount()==1){
			JOptionPane.showMessageDialog(null, 
			"You have clicked "+(arg0.getButton()==1?" ":
				arg0.getButton()==2?"ToÄ�kiÄ‡":" "));
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
