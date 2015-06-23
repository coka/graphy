package states;

import java.util.*;
import java.awt.event.*;

import gui.*;
import helpers.*;
import shapes.*;
import views.*;

public class SelectState extends State
{
  @Override
  public void mouse_pressed(MouseEvent e)
  {
    GraphicsView g = MainWindow.get_instance().workspaceController.get_model().get_documents().get(0).get_view().get_context();
    if ((e.getModifiers() & MouseEvent.CTRL_MASK) == 0)
    {
      boolean missedEverything = true;
      for (int i = 0; i < g.get_shapes().size(); i++)
      {
        AbstractShape currentShape = g.get_shapes().get(i);
        if (currentShape.get_shape().contains(e.getX() - currentShape.get_position().x, e.getY() - currentShape.get_position().y))
        {
          if (missedEverything) { missedEverything = false; }
          g.clear_selection();
          g.set_selected_at(i);
        }
      }
      if (missedEverything) { g.clear_selection(); }
    }
    else
    {
      int mem = -1; // toggle only the element on top
      for (int i = 0; i < g.get_shapes().size(); i++)
      {
        AbstractShape currentShape = g.get_shapes().get(i);
        if (currentShape.get_shape().contains(e.getX() - currentShape.get_position().x, e.getY() - currentShape.get_position().y))
        {
          { mem = i; }
        }
      }
      if (mem != -1) { g.toggle_selected_at(mem); }
    }
  }
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
}









