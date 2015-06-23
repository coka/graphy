package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public abstract class AbstractShape
{
  private Vec2f position;
  private float rotation;
  private float scale   ;
  private float size    ;
  private Color stroke  ;
  private Color fill    ;
  private boolean isSelected = false;

  private Shape shape = new GeneralPath();

  public AbstractShape(Vec2f position, float size)
  {
    this.position = position   ;
    this.rotation = 0.0f       ;
    this.scale    = 1.0f       ;
    this.size     = size       ;
    this.stroke   = Color.BLACK;
    this.fill     = null       ;
  }

  public AbstractShape(Vec2f position, float size, Color stroke, Color fill)
  {
    this.position = position   ;
    this.rotation = 0.0f       ;
    this.scale    = 1.0f       ;
    this.size     = size       ;
    this.stroke   = stroke     ;
    this.fill     = fill       ;
  }

  public Vec2f get_position() { return this.position; }
  public float get_rotation() { return this.rotation; }
  public float get_scale   () { return this.scale   ; }
  public float get_size    () { return this.size    ; }
  public Color get_stroke  () { return this.stroke  ; }
  public Color get_fill    () { return this.fill    ; }
  public Shape get_shape   () { return this.shape   ; }
  public boolean get_isSelected() { return this.isSelected; }

  public void set_position(Vec2f position) { this.position = position; }
  public void set_rotation(float rotation) { this.rotation = rotation; }
  public void set_scale   (float scale)    { this.scale    = scale   ; }
  public void set_selected(boolean flag)   { this.isSelected = flag  ; }
  public void toggle_selected() { this.isSelected = !this.isSelected; }

  public abstract void construct_shape();

  public void draw_handles(Graphics2D context)
  {
    float w = this.size * 0.5f;
    float h = this.size * 0.5f;
    float s = 4.0f; // handle half-size

    context.setColor(Color.BLACK);

    Rectangle2D.Float handle = new Rectangle2D.Float(0.0f, 0.0f, s * 2.0f, s * 2.0f);

    handle.y = -s;
    handle.x = -s;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);

    handle.y += h;
    handle.x = -s;
    context.fill(handle);
    handle.x += w;
    // don't draw the center point
    handle.x += w;
    context.fill(handle);

    handle.y += h;
    handle.x = -s;
    context.fill(handle);
    handle.x += w;
    context.fill(handle);
    handle.x += w;
    context.setColor(Color.RED); // for debugging 90-degree rotation
    context.fill(handle);
  }

  public void draw(Graphics2D context)
  {
    AffineTransform oldTransform = context.getTransform();

    context.translate(this.get_position().x, this.get_position().y);
    context.rotate(this.get_rotation(), this.get_size() * 0.5f, this.get_size() * 0.5f);

    if (this.get_fill() != null)
    {
      context.setColor(this.get_fill());
      context.fill(this.get_shape());
    }
    context.setColor(this.get_stroke());
    context.draw(this.get_shape());
    if (this.get_isSelected()) { this.draw_handles(context); }

    context.setTransform(oldTransform);
  }
}
