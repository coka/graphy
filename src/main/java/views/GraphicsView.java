package views;

import java.util.*;
import java.awt.*;
import javax.swing.*;

import shapes.*;
import helpers.*;

public class GraphicsView extends JComponent
{
  private ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();

  public GraphicsView() { super(); }

  @Override
  public void paint(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g;

    for (int i = 0; i < this.shapes.size(); i++)
    {
      this.shapes.get(i).draw(g2);
    }
  }

  public ArrayList<AbstractShape> get_shapes() { return this.shapes; }

  public void add_shape(AbstractShape shape)
  {
    this.shapes.add(shape);
    this.repaint();
  }

  public void set_selected_at(int index)
  {
    this.shapes.get(index).set_selected(true);
    this.repaint();
  }

  public void toggle_selected_at(int index)
  {
    this.shapes.get(index).toggle_selected();
    this.repaint();
  }

  public void delete_selected()
  {
    for (int i = 0; i < this.shapes.size(); i++)
    {
      if (this.shapes.get(i).get_isSelected())
      {
        this.shapes.remove(i);
        i--;
      }
    }
    this.repaint();
  }

  public void clear_selection()
  {
    for (int i = 0; i < this.shapes.size(); i++) { this.shapes.get(i).set_selected(false); }
    this.repaint();
  }
}
