package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class TileWindowsHorizontallyAction extends AbstractAction
{
  public TileWindowsHorizontallyAction(ImageIcon icon)
  {
    super("Tile Windows Horizontally", icon);
    putValue(MNEMONIC_KEY, new Integer('H'));
  }

  public void actionPerformed(ActionEvent e)
  {
    MainWindow.get_instance().centerPanel.tile_diagrams_horizontally();
  }
}
