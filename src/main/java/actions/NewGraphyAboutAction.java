package actions;

import gui.MainWindow;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class NewGraphyAboutAction extends AbstractAction
{
  private Integer mnemonic = new Integer('A');

  public NewGraphyAboutAction(ImageIcon icon)
  {
    super("About", icon);
    putValue(MNEMONIC_KEY, mnemonic);
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.create_about();
 }
}
