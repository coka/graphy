package gui;

import javax.swing.*;

public class BottomPanel extends JPanel
{
  private JPanel[] panelArray = new JPanel[5];

  public BottomPanel()
  {
    // use the implied FlowLayout
    for (int i = 0; i < panelArray.length; i++)
    {
      JPanel panel = new JPanel();
      if (i == 0) { panel.add(new JLabel("Position:")); }
      else { panel.add(new JLabel("Graph editor")); }
      this.add(panel);
    }
  }
}
