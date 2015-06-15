package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class CascadeWindowsAction extends AbstractAction
{
  private Integer mnemonic = new Integer('C');

  public CascadeWindowsAction(ImageIcon icon)
  {
    super("Cascade Windows", icon);
    putValue(MNEMONIC_KEY, mnemonic);
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().workspaceController.cascade_diagrams();
  }
}
