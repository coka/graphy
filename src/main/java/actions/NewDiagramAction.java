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
    MainWindow instance = MainWindow.get_instance();
    Diagram diagram = instance.centerPanel.create_diagram();
    instance.centerPanel.add(diagram);
    instance.centerPanel.moveToFront(diagram);
  }
}
