package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public abstract class AbstractShape
{
  private Vec2f position;
  private Color stroke  ;
  private Color fill    ;
  private boolean isSelected = false;

  private Shape shape = new GeneralPath();

  public AbstractShape(Vec2f position)
  {
    this.position = position   ;
    this.stroke   = Color.BLACK;
    this.fill     = null       ;
  }

  public AbstractShape(Vec2f position, Color stroke, Color fill)
  {
    this.position = position;
    this.stroke   = stroke  ;
    this.fill     = fill    ;
  }

  public Vec2f  get_position() { return this.position; }
  public Color  get_stroke  () { return this.stroke  ; }
  public Color  get_fill    () { return this.fill    ; }
  public Shape  get_shape   () { return this.shape   ; }

  public void set_selected(boolean flag) { this.isSelected = flag; }

  public abstract void construct_shape();
  public void draw_handles(Graphics2D context) {}

  public void draw(Graphics2D context)
  {
    if (this.fill != null)
    {
      context.setColor(this.fill);
      context.fill(this.shape);
    }
    context.setColor(this.stroke);
    context.draw(this.shape);
    if (this.isSelected) { this.draw_handles(context); }
  }
}
