package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public class RectangleShape extends AbstractShape
{
  private float width, height;

  public RectangleShape(Vec2f position, float size)
  {
    super(position, new Vec2f(size));
    this.width  = size;
    this.height = size;
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, float width, float height)
  {
    super(position, new Vec2f(width, height));
    this.width  = width ;
    this.height = height;
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, float size, Color stroke, Color fill)
  {
    super(position, new Vec2f(size), stroke, fill);
    this.width  = size;
    this.height = size;
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, float width, float height, Color stroke, Color fill)
  {
    super(position, new Vec2f(width, height), stroke, fill);
    this.width  = width ;
    this.height = height;
    this.construct_shape();
  }

  public void construct_shape()
  {
    ((GeneralPath)this.get_shape()).moveTo(0.0f, 0.0f);
    ((GeneralPath)this.get_shape()).lineTo(this.width, 0.0f);
    ((GeneralPath)this.get_shape()).lineTo(this.width, this.height);
    ((GeneralPath)this.get_shape()).lineTo(0.0f, this.height);
    ((GeneralPath)this.get_shape()).closePath();
  }

  @Override
  public void draw(Graphics2D context)
  {
    AffineTransform oldTransform = context.getTransform();

    context.translate(this.get_position().x - this.get_size().x * 0.5f, this.get_position().y - this.get_size().y * 0.5f);
    context.rotate(this.get_rotation(), this.get_size().x * 0.5f, this.get_size().y * 0.5f);

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
