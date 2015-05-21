package gui;

import javax.swing.*;

import actions.*;

public class MenuBar extends JMenuBar
{
  private JMenu[] menuArray = new JMenu[5]; // hard-coded number of menus

  private String[] menus = new String[] {"File", "Edit", "View", "Window", "Help"};
  private char[] menuMnemonics = {'F', 'E', 'V', 'W', 'H'};

  private String[] fileItems = new String[] {"New Diagram", "Open", "Save", "Import Diagram", "Export Diagram", "Close/Remove Diagram"};
  private String[] editItems = new String[] {"Undo", "Redo", "Cut", "Copy", "Paste", "Rotate Left", "Rotate Right", "Rename Diagram", "Delete Element"};
  private String[] viewItems = new String[] {"Zoom In", "Zoom Out"};
  private String[] windowItems = new String[] {"Cascade Windows", "Tile Windows Vertically", "Tile Windows Horizontally", "Previous Window", "Next Window"};
  private String[] helpItems = new String[] {"About"};

  private char[] fileMnemonics = {'N', 'O', 'S', 'I', 'E', 'C'};
  private char[] editMnemonics = {'U', 'R', 'C', 'Y', 'P', 'L', 'R', 'n', 'D'};
  private char[] viewMnemonics = {'I', 'O'};
  private char[] windowMnemonics = {'C', 'V', 'H', 'P', 'N'};
  private char[] helpMnemonics = {'A'};

  public MenuBar()
  {
    // Create all menus
    for (int i = 0; i < menus.length; i++)
    {
      JMenu menu = new JMenu(menus[i]);
      menu.setMnemonic(menuMnemonics[i]);
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
      PlaceholderAction action = new PlaceholderAction(windowItems[i], icon, new Integer(windowMnemonics[i]));
      JMenuItem item = new JMenuItem(action);
      menuArray[3].add(item);
    }

    // Populate the "Help" menu
    for (int i = 0; i < helpItems.length; i++)
    {
      ImageIcon icon = new ImageIcon("images/Top Panel/" + helpItems[i] + ".jpg");
      PlaceholderAction action = new PlaceholderAction(helpItems[i], icon, new Integer(helpMnemonics[i]));
      JMenuItem item = new JMenuItem(action);
      menuArray[4].add(item);
    }

    // Add all created menus to the menu bar
    for (int i = 0; i < menus.length; i++)
    {
      this.add(menuArray[i]);
    }
  }
}
