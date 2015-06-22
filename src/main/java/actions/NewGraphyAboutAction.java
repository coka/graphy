package actions;

import gui.MainWindow;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class NewGraphyAboutAction extends AbstractAction
{
  public NewGraphyAboutAction(ImageIcon icon)
  {
    super("About", icon);
    putValue(MNEMONIC_KEY, new Integer('A'));
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.create_about();
 }
}
