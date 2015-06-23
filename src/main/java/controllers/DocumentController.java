package controllers;

import java.awt.*;
import java.awt.event.*;

import models.*;
import views.*;
import states.*;
import shapes.*;
import helpers.*;

public class DocumentController
{
  private DocumentView view;
  private DocumentModel model;
  private DocumentStateManager stateManager = new DocumentStateManager(this);

  public DocumentController(DocumentModel model, DocumentView view)
  {
    this.model = model;
    this.view = view;
    this.add_listeners();
  }

  public void add_listeners()
  {
    this.view.get_context().addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e)
      {
        if (e.getButton() == MouseEvent.BUTTON1)
        {
          float size   = 100.0f;
          if (stateManager.get_currentState() instanceof RectangleState)
          {
            RectangleShape rectangle = new RectangleShape(new Vec2f(e.getX(), e.getY()), size, Color.BLACK, Color.GREEN);
            view.get_context().add_shape(rectangle);
          }
          else if (stateManager.get_currentState() instanceof OutlineRectangleState)
          {
            RectangleShape outlineRectangle = new RectangleShape(new Vec2f(e.getX(), e.getY()), size);
            view.get_context().add_shape(outlineRectangle);
          }
          else if (stateManager.get_currentState() instanceof TriangleState)
          {
            PolygonShape triangle = new PolygonShape(new Vec2f(e.getX(), e.getY()), size, Color.BLACK, Color.GREEN, 3);
            view.get_context().add_shape(triangle);
          }
          else if (stateManager.get_currentState() instanceof OutlineTriangleState)
          {
            PolygonShape outlineTriangle = new PolygonShape(new Vec2f(e.getX(), e.getY()), size, 3);
            view.get_context().add_shape(outlineTriangle);
          }
          else if (stateManager.get_currentState() instanceof StarState)
          {
            StarShape star = new StarShape(new Vec2f(e.getX(), e.getY()), size, Color.BLACK, Color.GREEN);
            view.get_context().add_shape(star);
          }
          else if (stateManager.get_currentState() instanceof OutlineStarState)
          {
            StarShape outlineStar = new StarShape(new Vec2f(e.getX(), e.getY()), size);
            view.get_context().add_shape(outlineStar);
          }
          else if (stateManager.get_currentState() instanceof HexagonState)
          {
            PolygonShape hexagon = new PolygonShape(new Vec2f(e.getX(), e.getY()), size, Color.BLACK, Color.GREEN, 6);
            view.get_context().add_shape(hexagon);
          }
          else if (stateManager.get_currentState() instanceof OutlineHexagonState)
          {
            PolygonShape outlineHexagon = new PolygonShape(new Vec2f(e.getX(), e.getY()), size, 6);
            view.get_context().add_shape(outlineHexagon);
          }
          else if (stateManager.get_currentState() instanceof SelectState)
          {
            if ((e.getModifiers() & MouseEvent.CTRL_MASK) == 0)
            {
              boolean missedEverything = true;
              for (int i = 0; i < view.get_context().get_shapes().size(); i++)
              {
                AbstractShape currentShape = view.get_context().get_shapes().get(i);
                if (currentShape.get_shape().contains(e.getX() - currentShape.get_position().x + currentShape.get_size() * 0.5f,
                                                      e.getY() - currentShape.get_position().y + currentShape.get_size() * 0.5f))
                {
                  if (missedEverything) { missedEverything = false; }
                  view.get_context().clear_selection();
                  view.get_context().set_selected_at(i);
                }
              }
              if (missedEverything) { view.get_context().clear_selection(); }
            }
            else
            {
              int mem = -1; // toggle only the element on top
              for (int i = 0; i < view.get_context().get_shapes().size(); i++)
              {
                AbstractShape currentShape = view.get_context().get_shapes().get(i);
                if (currentShape.get_shape().contains(e.getX() - currentShape.get_position().x + currentShape.get_size() * 0.5f,
                                                      e.getY() - currentShape.get_position().y + currentShape.get_size() * 0.5f))
                { mem = i; }
              }
              if (mem != -1) { view.get_context().toggle_selected_at(mem); }
            }
          }
        }
      }
    });
}

public DocumentModel get_model() { return this.model; }
public DocumentView get_view() { return this.view; }

public void set_rectangleState() { this.stateManager.set_rectangleState(); }
public void set_triangleState() { this.stateManager.set_triangleState(); }
public void set_starState() { this.stateManager.set_starState(); }
public void set_hexagonState() { this.stateManager.set_hexagonState(); }

public void set_outlineRectangleState() { this.stateManager.set_outlineRectangleState(); }
public void set_outlineTriangleState() { this.stateManager.set_outlineTriangleState(); }
public void set_outlineStarState() { this.stateManager.set_outlineStarState(); }
public void set_outlineHexagonState() { this.stateManager.set_outlineHexagonState(); }

public void set_selectState() { this.stateManager.set_selectState(); }
}
