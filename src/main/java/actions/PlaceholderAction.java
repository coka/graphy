package actions;

import java.awt.event.*;
import javax.swing.*;

public class PlaceholderAction extends AbstractAction
{
  private String actionName;

  public PlaceholderAction(String name, Integer mnemonic)
  {
    super(name);
    actionName = name;
    putValue(MNEMONIC_KEY, mnemonic);
  }

  public PlaceholderAction(String name, ImageIcon icon)
  {
    super(name, icon);
    actionName = name;
  }

  public PlaceholderAction(String name, ImageIcon icon, Integer mnemonic)
  {
    super(name, icon);
    actionName = name;
    putValue(MNEMONIC_KEY, mnemonic);
  }

  public void actionPerformed(ActionEvent e)
  {
    System.out.println("\"" + this.actionName + "\"" + " is a default action stub.");
  }
}
