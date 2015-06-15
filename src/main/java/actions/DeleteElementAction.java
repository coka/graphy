package actions;

import java.awt.event.*;
import javax.swing.*;

import gui.*;
import views.*;

public class DeleteElementAction extends AbstractAction
{
  public DeleteElementAction(ImageIcon icon) { super("Delete Element", icon); }

  public void actionPerformed(ActionEvent e)
  {
    DocumentView activeDocument = (DocumentView)MainWindow.get_instance().workspaceController.get_view().getSelectedFrame();
    activeDocument.get_context().delete_selected();
  }
}
