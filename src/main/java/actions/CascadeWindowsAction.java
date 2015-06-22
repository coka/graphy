package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class CascadeWindowsAction extends AbstractAction
{
  public CascadeWindowsAction(ImageIcon icon)
  {
    super("Cascade Windows", icon);
    putValue(MNEMONIC_KEY, new Integer('C'));
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().workspaceController.cascade_diagrams();
  }
}
