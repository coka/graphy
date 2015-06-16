package actions;

import gui.MainWindow;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class RectangleColorPickerAction extends AbstractAction
{
  //private Integer mnemonic = new Integer('A');

  public RectangleColorPickerAction(ImageIcon icon)
  {
    super("About", icon);
   //putValue(MNEMONIC_KEY, mnemonic);
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.create_color_picker();
 }
}
