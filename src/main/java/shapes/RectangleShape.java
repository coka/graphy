package shapes;

import java.util.*;
import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public class RectangleShape extends AbstractShape
{
  private float width, height;

  public RectangleShape(Vec2f position, float size)
  {
    super(position);
    this.width  = size;
    this.height = size;
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, float width, float height)
  {
    super(position);
    this.width  = width ;
    this.height = height;
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, Color stroke, Color fill, float size)
  {
    super(position, stroke, fill);
    this.width  = size;
    this.height = size;
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, Color stroke, Color fill, float width, float height)
  {
    super(position, stroke, fill);
    this.width  = width ;
    this.height = height;
    this.construct_shape();
  }

  public void construct_shape()
  {
    ((GeneralPath)this.get_shape()).moveTo(this.get_position().x             , this.get_position().y              );
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x + this.width, this.get_position().y              );
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x + this.width, this.get_position().y + this.height);
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x             , this.get_position().y + this.height);
    ((GeneralPath)this.get_shape()).closePath();
  }

  @Override
  public void draw_handles(Graphics2D context)
  {
    float x = this.get_position().x;
    float y = this.get_position().y;
    float w = this.width * 0.5f;
    float h = this.height * 0.5f;
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
}
