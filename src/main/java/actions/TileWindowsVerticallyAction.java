package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class TileWindowsVerticallyAction extends AbstractAction
{
  public TileWindowsVerticallyAction(ImageIcon icon)
  {
    super("Tile Windows Vertically", icon);
    putValue(MNEMONIC_KEY, new Integer('V'));
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.tile_diagrams_vertically();
  }
}
