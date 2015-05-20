package gui;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame
{
  public MainWindow()
  {
    super("Graphy");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);
    this.setJMenuBar(new MenuBar());
    this.add(new TopPanel(), BorderLayout.NORTH);
    this.add(new RightPanel(), BorderLayout.EAST);
    this.add(new BottomPanel(800, 600), BorderLayout.SOUTH);
    this.add(new LeftPanel(), BorderLayout.WEST);
    this.add(new CenterPanel(), BorderLayout.CENTER);
    this.setVisible(true);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    ImageIcon img = new ImageIcon("images/Logo.png");
    this.setIconImage(img.getImage());
  }
}
