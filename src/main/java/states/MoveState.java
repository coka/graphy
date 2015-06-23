package states;

import java.util.*;
import java.awt.event.*;

import gui.*;
import helpers.*;
import shapes.*;
import views.*;

public class MoveState extends State
{
  @Override
  public void mouse_dragged(MouseEvent e)
  {
    GraphicsView g = MainWindow.get_instance().workspaceController.get_model().get_documents().get(0).get_view().get_context();
    ArrayList<AbstractShape> shapes = g.get_shapes();
    for (int i = 0; i < shapes.size(); i++)
    {
      AbstractShape shape = shapes.get(i);
      if (shape.get_isSelected()) { shape.set_position(new Vec2f(e.getX(), e.getY())); }
    }
    g.repaint();
  }

  @Override
  public void mouse_released(MouseEvent e)
  {
    MainWindow.get_instance().workspaceController.get_model().get_documents().get(0).set_selectState();
  }
}
