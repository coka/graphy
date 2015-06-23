package states;

import java.awt.*;
import java.awt.event.*;

import gui.*;
import helpers.*;
import shapes.*;

public class StarOutlineState extends State
{
  @Override
  public void mouse_pressed(MouseEvent e)
  {
    StarShape star = new StarShape(new Vec2f(e.getX(), e.getY()), 100.0f);
    MainWindow.get_instance().workspaceController.get_model().get_documents().get(0).get_view().get_context().add_shape(star);
  }
}
