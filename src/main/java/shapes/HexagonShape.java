package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public class HexagonShape extends AbstractShape
{
  private float width, height;

  public HexagonShape(Vec2f position, float size)
  {
    super(position, new Vec2f(size));
    this.width  = size;
    this.height = size;
    this.construct_shape();
  }

  public HexagonShape(Vec2f position, float width, float height)
  {
    super(position, new Vec2f(width, height));
    this.width  = width ;
    this.height = height;
    this.construct_shape();
  }

  public HexagonShape(Vec2f position, float size, Color stroke, Color fill)
  {
    super(position, new Vec2f(size), stroke, fill);
    this.width  = size;
    this.height = size;
    this.construct_shape();
  }

  public HexagonShape(Vec2f position, float width, float height, Color stroke, Color fill)
  {
    super(position, new Vec2f(width, height), stroke, fill);
    this.width  = width ;
    this.height = height;
    this.construct_shape();
  }

  public void construct_shape()
  {
    ((GeneralPath)this.get_shape()).moveTo(this.get_position().x + this.width*1/4, this.get_position().y                  );
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x + this.width*3/4, this.get_position().y                  );
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x + this.width*4/4, this.get_position().y + this.height*1/2);
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x + this.width*3/4, this.get_position().y + this.height*2/2);
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x + this.width*1/4, this.get_position().y + this.height*2/2);
    ((GeneralPath)this.get_shape()).lineTo(this.get_position().x                 , this.get_position().y + this.height*1/2);
    ((GeneralPath)this.get_shape()).closePath();
  }
}
