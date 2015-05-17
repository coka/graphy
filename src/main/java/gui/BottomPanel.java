package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BottomPanel extends JPanel
{
  public BottomPanel(int width, int height)
  {
    this.setPreferredSize(new Dimension(width, 24));
    this.setLayout(new GridLayout(1, 5, 4, 4));
    for (int i = 0; i < 5; i++)
    {
      if (i == 0) { this.add(create_bottom_panel_label("Position:")); }
      else { this.add(create_bottom_panel_label("Graph editor")); }
    }
  }

  private JLabel create_bottom_panel_label(String text)
  {
    JLabel label = new JLabel(text);
    label.setHorizontalAlignment(JLabel.CENTER);

    Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
    label.setBorder(border);

    return label;
  }
}
