package gui;

import javax.swing.*;

import actions.*;

public class MenuBar extends JMenuBar
{
  public MenuBar()
  {
    JMenu[] menuArray = new JMenu[5]; // hard-coded number of menus

    String[] menus   = new String[] {"File", "Edit", "View", "Window", "Help"};
    char[] mnemonics = new char[]   {'F', 'E', 'V', 'W', 'H'};

    String[] fileItems   = new String[] {"New Diagram", "Open", "Save", "Import Diagram", "Export Diagram", "Close/Remove Diagram"};
    String[] editItems   = new String[] {"Undo", "Redo", "Cut", "Copy", "Paste", "Rotate Left", "Rotate Right", "Rename Diagram", "Delete Element"};
    String[] viewItems   = new String[] {"Zoom In", "Zoom Out"};
    String[] windowItems = new String[] {"Cascade Windows", "Tile Windows Vertically", "Tile Windows Horizontally", "Previous Window", "Next Window"};
    String[] helpItems   = new String[] {"About"};

    char[] fileMnemonics   = new char[] {'N', 'O', 'S', 'I', 'E', 'C'};
    char[] editMnemonics   = new char[] {'U', 'R', 'C', 'Y', 'P', 'L', 'R', 'n', 'D'};
    char[] viewMnemonics   = new char[] {'I', 'O'};
    char[] windowMnemonics = new char[] {'C', 'V', 'H', 'P', 'N'};
    char[] helpMnemonics   = new char[] {'A'};


    // Create all menus
    for (int i = 0; i < menus.length; i++)
    {
      JMenu menu = new JMenu(menus[i]);
      menu.setMnemonic(mnemonics[i]);
      menuArray[i] = menu;
    }

    // Populate the "File" menu
    for (int i = 0; i < fileItems.length; i++)
    {
      ImageIcon icon;
      if (i == fileItems.length - 1) { icon = new ImageIcon("images/Top Panel/" + "Close Remove Diagram" + ".jpg"); } // dirty
      else { icon = new ImageIcon("images/Top Panel/" + fileItems[i] + ".jpg"); }
      if (i == 0)
      {
        NewDiagramAction action = new NewDiagramAction(icon);
        JMenuItem item = new JMenuItem(action);
        KeyStroke keyStroke = KeyStroke.getKeyStroke("control N");
        item.setAccelerator(keyStroke);
        menuArray[0].add(item);
      }
      else
      {
        PlaceholderAction action = new PlaceholderAction(fileItems[i], icon, new Integer(fileMnemonics[i]));
        JMenuItem item = new JMenuItem(action);
        menuArray[0].add(item);
      }
    }

    // Populate the "Edit" menu
    for (int i = 0; i < editItems.length; i++)
    {
      ImageIcon icon = new ImageIcon("images/Top Panel/" + editItems[i] + ".jpg");
      PlaceholderAction action = new PlaceholderAction(editItems[i], icon, new Integer(editMnemonics[i]));
      JMenuItem item = new JMenuItem(action);
      menuArray[1].add(item);
    }

    // Populate the "View" menu
    for (int i = 0; i < viewItems.length; i++)
    {
      ImageIcon icon = new ImageIcon("images/Top Panel/" + viewItems[i] + ".jpg");
      PlaceholderAction action = new PlaceholderAction(viewItems[i], icon, new Integer(viewMnemonics[i]));
      JMenuItem item = new JMenuItem(action);
      menuArray[2].add(item);
    }

    // Populate the "Window" menu
    for (int i = 0; i < windowItems.length; i++)
    {
      ImageIcon icon = new ImageIcon("images/Top Panel/" + windowItems[i] + ".jpg");
      JMenuItem item;
      if (windowItems[i] == "Cascade Windows")
      {
        CascadeWindowsAction action = new CascadeWindowsAction(icon);
        item = new JMenuItem(action);
        KeyStroke keyStroke = KeyStroke.getKeyStroke("control alt C");
        item.setAccelerator(keyStroke);
      }
      else if (windowItems[i] == "Tile Windows Vertically")
      {
        TileWindowsVerticallyAction action = new TileWindowsVerticallyAction(icon);
        item = new JMenuItem(action);
        KeyStroke keyStroke = KeyStroke.getKeyStroke("control alt V");
        item.setAccelerator(keyStroke);
      }
      else if (windowItems[i] == "Tile Windows Horizontally")
      {
        TileWindowsHorizontallyAction action = new TileWindowsHorizontallyAction(icon);
        item = new JMenuItem(action);
        KeyStroke keyStroke = KeyStroke.getKeyStroke("control alt H");
        item.setAccelerator(keyStroke);
      }
      else
      {
        PlaceholderAction action = new PlaceholderAction(windowItems[i], icon, new Integer(windowMnemonics[i]));
        item = new JMenuItem(action);
      }
      menuArray[3].add(item);
    }

    // Populate the "Help" menu
    for (int i = 0; i < helpItems.length; i++)
    {
      ImageIcon icon = new ImageIcon("images/Top Panel/" + helpItems[i] + ".jpg");
      NewGraphyAboutAction action = new NewGraphyAboutAction(icon);
      KeyStroke keyStroke = KeyStroke.getKeyStroke("control A");
      JMenuItem item = new JMenuItem(action);
      item.setAccelerator(keyStroke);
      menuArray[4].add(item);
    }

    // Add all created menus to the menu bar
    for (int i = 0; i < menus.length; i++)
    {
      this.add(menuArray[i]);
    }
  }
}
