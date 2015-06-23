package gui;

import java.awt.*;
import javax.swing.*;

import models.*;
import views.*;
import controllers.*;

public class MainWindow extends JFrame
{
  private static MainWindow instance = null;
  public static WorkspaceView centerPanel = new WorkspaceView();
  public WorkspaceModel workspaceModel = new WorkspaceModel();
  public WorkspaceController workspaceController = new WorkspaceController(workspaceModel, centerPanel);
  private StatusBarController statusBar = new StatusBarController(new StatusBarModel(), new StatusBarView());

  public static MainWindow get_instance()
  {
    if (instance == null) { instance = new MainWindow(); }
    return instance;
  }

  private MainWindow()
  {
    super();

    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      SwingUtilities.updateComponentTreeUI(this);
    }
    catch (Exception e) { e.printStackTrace(); }

    this.setTitle("Graphy");
    this.setSize(1000, 600);
    this.setLocationRelativeTo(null);
    this.setJMenuBar(new MenuBar());
    this.add(new TopPanel(), BorderLayout.NORTH);
    this.add(new RightPanel(), BorderLayout.EAST);
    this.add(this.statusBar.get_view(), BorderLayout.SOUTH);
    this.add(new LeftPanel(), BorderLayout.WEST);
    this.add(this.centerPanel, BorderLayout.CENTER);
    this.setVisible(true);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    ImageIcon img = new ImageIcon("images/Logo.png");
    this.setIconImage(img.getImage());

    addWindowListener(new GraphyWindowListener());
  }

  public static void main(String[] args)
  {
    MainWindow window = MainWindow.get_instance();
  }

  public DocumentController temp() { return MainWindow.get_instance().workspaceController.get_model().get_documents().get(0); }
  public void update_status_bar()
  {
    DocumentModel dm = this.temp().get_model();
    statusBar.set_position(dm.get_mx(), dm.get_my());
  }
}
