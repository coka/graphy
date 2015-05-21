package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class TileWindowsVerticallyAction extends AbstractAction
{
  private Integer mnemonic = new Integer('V');

  public TileWindowsVerticallyAction(ImageIcon icon)
  {
    super("Tile Windows Vertically", icon);
    putValue(MNEMONIC_KEY, mnemonic);
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.tile_diagrams_vertically();
  }
}
