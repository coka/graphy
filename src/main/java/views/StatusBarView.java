package views;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class StatusBarView extends JPanel
{
  ArrayList<JLabel> labels = new ArrayList<JLabel>();

  public StatusBarView()
  {
    this.setPreferredSize(new Dimension(800, 24));
    this.setLayout(new GridLayout(1, 5, 4, 4));
    for (int i = 0; i < 5; i++)
    {
      this.labels.add(new JLabel("default"));
      this.labels.get(i).setHorizontalAlignment(JLabel.CENTER);
      Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
      this.labels.get(i).setBorder(border);
      this.add(this.labels.get(i));
    }
  }

  public void set_label_at(int i, String text) { this.labels.get(i).setText(text); }
}
