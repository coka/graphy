package controllers;

import java.awt.*;

import models.*;
import views.*;

public class StatusBarController
{
  private StatusBarModel model;
  private StatusBarView view;

  public StatusBarController(StatusBarModel model, StatusBarView view)
  {
    this.model = model;
    this.view  = view;

    this.update_view();
  }

  public StatusBarView get_view() { return this.view; }

  public void update_view()
  {
    for (int i = 0; i < 5; i++)
    {
      this.view.set_label_at(i, this.model.get_label_at(i));
    }
  }

  public void set_position(int x, int y)
  {
    this.model.set_label_at(0, "Position: " + x + " " + y);
    this.update_view();
  }
}
