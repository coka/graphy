package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class NewDiagramAction extends AbstractAction
{
  public NewDiagramAction(ImageIcon icon)
  {
    super("New Diagram", icon);
    putValue(MNEMONIC_KEY, new Integer('N'));
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().workspaceController.create_diagram();
  }
}
