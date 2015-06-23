package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public class RectangleShape extends AbstractShape
{
  public RectangleShape(Vec2f position, float size)
  {
    super(position, size);
    this.construct_shape();
  }

  public RectangleShape(Vec2f position, float size, Color stroke, Color fill)
  {
    super(position, size, stroke, fill);
    this.construct_shape();
  }

  public void construct_shape()
  {
    float hs = this.get_size() * 0.5f;
    ((GeneralPath)this.get_shape()).moveTo(-hs, -hs);
    ((GeneralPath)this.get_shape()).lineTo( hs, -hs);
    ((GeneralPath)this.get_shape()).lineTo( hs,  hs);
    ((GeneralPath)this.get_shape()).lineTo(-hs,  hs);
    ((GeneralPath)this.get_shape()).closePath();
  }
}
