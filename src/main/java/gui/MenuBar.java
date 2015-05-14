package gui;

import javax.swing.*;

public class MenuBar extends JMenuBar
{
  private JMenu[] menuArray = new JMenu[5]; // hard-coded number of menus

  private String[] menus = new String[] {"File", "Edit", "View", "Window", "Help"};

  private String[] fileItems = new String[] {"New Diagram", "Open", "Save", "Import Diagram", "Export Diagram", "Close/Remove Diagram"};
  private String[] editItems = new String[] {"Undo", "Redo", "Cut", "Copy", "Paste", "Rotate Left", "Rotate Right", "Rename Diagram", "Delete Element"};
  private String[] viewItems = new String[] {"Zoom In", "Zoom Out"};
  private String[] windowItems = new String[] {"Cascade Windows", "Tile Windows Vertically", "Tile Windows Horizontally", "Previous Window", "Next Window"};
  private String[] helpItems = new String[] {"About"};

  public MenuBar()
  {
    // Create all menus
    for (int i = 0; i < menus.length; i++)
    {
      JMenu menu = new JMenu(menus[i]);
      menuArray[i] = menu;
    }

    // Populate the "File" menu
    for (int i = 0; i < fileItems.length; i++)
    {
      JMenuItem item = new JMenuItem(fileItems[i]);
      menuArray[0].add(item);
    }

    // Populate the "Edit" menu
    for (int i = 0; i < editItems.length; i++)
    {
      JMenuItem item = new JMenuItem(editItems[i]);
      menuArray[1].add(item);
    }

    // Populate the "View" menu
    for (int i = 0; i < viewItems.length; i++)
    {
      JMenuItem item = new JMenuItem(viewItems[i]);
      menuArray[2].add(item);
    }

    // Populate the "Window" menu
    for (int i = 0; i < windowItems.length; i++)
    {
      JMenuItem item = new JMenuItem(windowItems[i]);
      menuArray[3].add(item);
    }

    // Populate the "Help" menu
    for (int i = 0; i < helpItems.length; i++)
    {
      JMenuItem item = new JMenuItem(helpItems[i]);
      menuArray[4].add(item);
    }

    // Add all created menus to the menu bar
    for (int i = 0; i < menus.length; i++)
    {
      this.add(menuArray[i]);
    }
  }
}
