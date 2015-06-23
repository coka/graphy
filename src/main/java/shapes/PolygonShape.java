package shapes;

import java.awt.*;
import java.awt.geom.*;

import helpers.*;

public class PolygonShape extends AbstractShape
{
  private int sides;

  public PolygonShape(Vec2f position, float size, int sides)
  {
    super(position, size);
    this.sides = sides;
    this.construct_shape();
  }

  public PolygonShape(Vec2f position, float size, Color stroke, Color fill, int sides)
  {
    super(position, size, stroke, fill);
    this.sides = sides;
    this.construct_shape();
  }

  public void construct_shape()
  {
    int sides = this.sides;
    float step = 2.0f * (float)Math.PI / (float)sides;
    float radius = this.get_size() * 0.5f;

    ((GeneralPath)this.get_shape()).moveTo(radius, 0.0f);
    for (int i = 1; i < sides; i++)
    {
      ((GeneralPath)this.get_shape()).lineTo(radius * Math.cos(i * step), radius * Math.sin(i * step));
    }
    ((GeneralPath)this.get_shape()).closePath();
  }
}
