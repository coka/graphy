package gui;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame
{
  public MainWindow()
  {
    super();
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.add(new TopPanel(), BorderLayout.NORTH);
    this.add(new RightPanel(), BorderLayout.EAST);
    this.add(new BottomPanel(), BorderLayout.SOUTH);
    this.add(new LeftPanel(), BorderLayout.WEST);
    this.add(new CenterPanel(), BorderLayout.CENTER);
    this.setVisible(true);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }
}
