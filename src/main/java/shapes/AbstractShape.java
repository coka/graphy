package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public abstract class AbstractShape
{
  private Vec2f position;
  private Vec2f size    ;
  private Color stroke  ;
  private Color fill    ;
  private boolean isSelected = false;

  private Shape shape = new GeneralPath();

  public AbstractShape(Vec2f position, Vec2f size)
  {
    this.position = position   ;
    this.size     = size       ;
    this.stroke   = Color.BLACK;
    this.fill     = null       ;
  }

  public AbstractShape(Vec2f position, Vec2f size, Color stroke, Color fill)
  {
    this.position = position;
    this.size     = size    ;
    this.stroke   = stroke  ;
    this.fill     = fill    ;
  }

  public Vec2f  get_position() { return this.position; }
  public Color  get_stroke  () { return this.stroke  ; }
  public Color  get_fill    () { return this.fill    ; }
  public Shape  get_shape   () { return this.shape   ; }
  public boolean get_isSelected() { return this.isSelected; }

  public void set_selected(boolean flag) { this.isSelected = flag; }
  public void toggle_selected() { this.isSelected = !this.isSelected; }

  public abstract void construct_shape();
  public void draw_handles(Graphics2D context)
  {
    float x = this.position.x;
    float y = this.position.y;
    float w = this.size.x * 0.5f;
    float h = this.size.y * 0.5f;
    float s = 4.0f; // handle half-size

    context.setColor(Color.BLACK);

    Rectangle2D.Float handle = new Rectangle2D.Float(0.0f, 0.0f, s * 2.0f, s * 2.0f);

    handle.y = y - s;
    handle.x = x - s;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);

    handle.y += h;
    handle.x = x - s;
    context.fill(handle);
    handle.x += w;
    // don't draw the center point
    handle.x += w;
    context.fill(handle);

    handle.y += h;
    handle.x = x - s;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);
  }

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
