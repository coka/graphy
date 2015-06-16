package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;
import views.*;

public class RotateRightAction extends AbstractAction
{
  public RotateRightAction(ImageIcon icon) { super("Rotate Right", icon); }

  public void actionPerformed(ActionEvent e)
  {
    DocumentView activeDocument = (DocumentView)MainWindow.get_instance().workspaceController.get_view().getSelectedFrame();
    activeDocument.get_context().rotate_selected_right();
  }
}
