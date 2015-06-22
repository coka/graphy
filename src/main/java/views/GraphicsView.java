package views;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import shapes.*;

public class GraphicsView extends JComponent
{
  private ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();

  double translateX = 1;
  double translateY = 1;

  public int hScrollValue=140;
  public int vScrollValue=140;

  double scaling = 1;
  final static double scalingFactor = 1.2;
  final static double translateFactor = 50;

  public GraphicsView() { super();

    this.addMouseWheelListener(new MouseWheelListener(){
      @Override
      public void mouseWheelMoved(MouseWheelEvent e) {
        if ((e.getModifiers() & InputEvent.CTRL_MASK) == InputEvent.CTRL_MASK) {
              //double newScaling = scaling;
          if(e.getWheelRotation()>0)
            scaling *= (double)e.getWheelRotation()*scalingFactor;
          else
            scaling /= -(double)e.getWheelRotation()*scalingFactor;

          if(scaling < 0.2)
            scaling = 0.2;
          if(scaling > 5)
            scaling = 5;

        }else if((e.getModifiers()&MouseWheelEvent.SHIFT_MASK) != 0){
          translateX += (double)e.getWheelRotation() * translateFactor/scaling;
        }else{
          translateY += (double)e.getWheelRotation() * translateFactor/scaling;
        }

        repaint();
      }

    });

  }

  @Override
  public void paint(Graphics g)
  {
    Graphics2D g2 = (Graphics2D)g;
    g2.translate(translateX, translateY);
    g2.scale( scaling, scaling );

    for (int i = 0; i < this.shapes.size(); i++)
    {

      this.shapes.get(i).draw(g2);
    }
  }

  public void adjustmentValueChanged(AdjustmentEvent e) {
    // TODO Auto-generated method stub

    if(e.getAdjustable().getOrientation()==Adjustable.HORIZONTAL){
      if(hScrollValue<e.getValue()){
        translateX += ((e.getValue()-hScrollValue)*(-translateFactor))/scaling;
        //transformation.translate((double)((e.getValue()-hScrollValue)*(-translateFactor))/transformation.getScaleX(), 0);

      }
      else{
        translateX += ((e.getValue()-hScrollValue)*(-translateFactor))/scaling;
      }
      hScrollValue=e.getValue();

    }
    else{
      if(vScrollValue<e.getValue()){
        translateY += ((e.getValue()-vScrollValue)*(-translateFactor))/scaling;
      }
      else{
        translateY += ((e.getValue()-vScrollValue)*(-translateFactor))/scaling;
      }
      vScrollValue=e.getValue();
    }

    repaint();

  }

  public void centerZoom(boolean direction) {

    if (direction)
      if (scaling > 4.9)
        return;
      else;
      else
        if (scaling < 0.3)
          return;

        if (direction)
          scaling *= scalingFactor;
        else
          scaling /= scalingFactor;

        if(scaling < 0.2)
          scaling = 0.2;
        if(scaling > 5)
          scaling = 5;

        repaint();
      }

      public ArrayList<AbstractShape> get_shapes() { return this.shapes; }

      public void add_shape(AbstractShape shape)
      {
        this.shapes.add(shape);
        this.repaint();
      }

      public void set_rotation_at(float rotation, int index)
      {
        this.shapes.get(index).set_rotation(rotation);
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

      public void rotate_selected_left()
      {
        for (int i = 0; i < this.shapes.size(); i++)
        {
          if (this.shapes.get(i).get_isSelected())
          {
            AbstractShape currentShape = this.shapes.get(i);
            float newRotation = currentShape.get_rotation() - (float)Math.PI / 2.0f;
            this.shapes.get(i).set_rotation(newRotation);
          }
        }
        this.repaint();
      }

      public void rotate_selected_right()
      {
        for (int i = 0; i < this.shapes.size(); i++)
        {
          if (this.shapes.get(i).get_isSelected())
          {
            AbstractShape currentShape = this.shapes.get(i);
            float newRotation = currentShape.get_rotation() + (float)Math.PI / 2.0f;
            this.shapes.get(i).set_rotation(newRotation);
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
