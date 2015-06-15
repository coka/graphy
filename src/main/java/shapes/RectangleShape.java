package shapes;

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
}
