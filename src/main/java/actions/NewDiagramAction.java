package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class NewDiagramAction extends AbstractAction
{
  private Integer mnemonic = new Integer('N');

  public NewDiagramAction(ImageIcon icon)
  {
    super("New Diagram", icon);
    putValue(MNEMONIC_KEY, mnemonic);
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.create_diagram();
  }
}
