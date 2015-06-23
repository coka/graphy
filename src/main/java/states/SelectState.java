package states;

import java.util.*;
import java.awt.event.*;

import gui.*;
import helpers.*;
import shapes.*;

import controllers.*;
import views.*;

public class SelectState extends State
{
  @Override
  public void mouse_pressed(MouseEvent e)
  {
    DocumentController mediator = MainWindow.get_instance().workspaceController.get_model().get_documents().get(0);
    GraphicsView g = mediator.get_view().get_context();
    if (isHandle(e.getX(), e.getY(), g)) { mediator.set_resizeState(); }
    else if(g.has_selected()) { mediator.set_moveState(); }
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
  public void mouse_released(MouseEvent e)
  {
    MainWindow.get_instance().workspaceController.get_model().get_documents().get(0).set_selectState();
  }

  public boolean isHandle(int x, int y, GraphicsView g)
  {
    ArrayList<AbstractShape> shapes = g.get_shapes();
    for (int i = 0; i < shapes.size(); i++)
    {
      AbstractShape cs = shapes.get(i);
      float modelX = x - cs.get_position().x;
      float modelY = y - cs.get_position().y;

      if (modelX <= -cs.get_size() / 2.0f + 4.0f && modelX >= -cs.get_size() / 2.0f - 4.0f)
      {
        if (modelY <= -cs.get_size() / 2.0f + 4.0f && modelY >= -cs.get_size() / 2.0f - 4.0f) { return true; }
        if (modelY <= 4.0f && modelY >= - 4.0f) { return true; }
        if (modelY <= cs.get_size() / 2.0f + 4.0f && modelY >= cs.get_size() / 2.0f - 4.0f) { return true; }
      }
      if (modelX <= 4.0f && modelX >= - 4.0f)
      {
        if (modelY <= -cs.get_size() / 2.0f + 4.0f && modelY >= -cs.get_size() / 2.0f - 4.0f) { return true; }
        if (modelY <= cs.get_size() / 2.0f + 4.0f && modelY >= cs.get_size() / 2.0f - 4.0f) { return true; }
      }
      if (modelX <= cs.get_size() / 2.0f + 4.0f && modelX >= cs.get_size() / 2.0f - 4.0f)
      {
        if (modelY <= -cs.get_size() / 2.0f + 4.0f && modelY >= -cs.get_size() / 2.0f - 4.0f) { return true; }
        if (modelY <= 4.0f && modelY >= - 4.0f) { return true; }
        if (modelY <= cs.get_size() / 2.0f + 4.0f && modelY >= cs.get_size() / 2.0f - 4.0f) { return true; }
      }
    }
    return false;
  }
}









