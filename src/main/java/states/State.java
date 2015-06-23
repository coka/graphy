package states;

import java.awt.event.MouseEvent;

import gui.*;

import controllers.*;

public class State
{
  public void mouse_pressed(MouseEvent e) {}
  public void mouse_released(MouseEvent e) {}
  public void mouse_dragged(MouseEvent e) {}
  public void mouse_moved  (MouseEvent e)
  {
    DocumentController dc = MainWindow.get_instance().temp();
    dc.get_model().set_mx(e.getX());
    dc.get_model().set_my(e.getY());
    MainWindow.get_instance().update_status_bar();
    e.consume();
  }
}
