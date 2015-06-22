package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;

public class ButtonNext extends AbstractAction
{
  public ButtonNext(ImageIcon icon)
  {
    super("Next Window", icon);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    MainWindow.centerPanel.selectFrame(false);
  }
}

