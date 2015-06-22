package actions;

import java.util.*;
import java.awt.event.*;
import javax.swing.*;

import gui.*;
import controllers.*;

public class OutlineTriangleStateAction extends AbstractAction
{
  public OutlineTriangleStateAction(String name, ImageIcon icon) { super(name, icon); }

  public void actionPerformed(ActionEvent e)
  {
    WorkspaceController controller = MainWindow.get_instance().workspaceController;
    ArrayList<DocumentController> allDocuments = controller.get_model().get_documents();
    for (int i = 0; i < allDocuments.size(); i++) { allDocuments.get(i).set_outlineTriangleState(); }
  }

}
