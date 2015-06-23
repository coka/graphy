package states;

import controllers.*;

public class DocumentStateManager
{
  private State currentState;

  private SelectState selectState;
  private MoveState moveState;
  private ResizeState resizeState;

  private RectangleState rectangleState;
  private TriangleState triangleState;
  private StarState starState;
  private HexagonState hexagonState;

  private RectangleOutlineState outlineRectangleState;
  private TriangleOutlineState outlineTriangleState;
  private StarOutlineState outlineStarState;
  private HexagonOutlineState outlineHexagonState;

  public DocumentStateManager(DocumentController mediator)
  {
    selectState = new SelectState();
    moveState = new MoveState();
    resizeState = new ResizeState();

    rectangleState = new RectangleState();
    triangleState = new TriangleState();
    starState = new StarState();
    hexagonState = new HexagonState();

    outlineRectangleState = new RectangleOutlineState();
    outlineTriangleState = new TriangleOutlineState();
    outlineStarState = new StarOutlineState();
    outlineHexagonState = new HexagonOutlineState();

    currentState = selectState;
  }

  public State get_currentState() { return this.currentState; }

  public void set_selectState() { this.currentState = this.selectState; }
  public void set_moveState() { this.currentState = this.moveState; }
  public void set_resizeState() { this.currentState = this.resizeState; }

  public void set_rectangleState() { this.currentState = this.rectangleState; }
  public void set_triangleState() { this.currentState = this.triangleState; }
  public void set_starState() { this.currentState = this.starState; }
  public void set_hexagonState() { this.currentState = this.hexagonState; }

  public void set_outlineRectangleState() { this.currentState = this.outlineRectangleState; }
  public void set_outlineTriangleState() { this.currentState = this.outlineTriangleState; }
  public void set_outlineStarState() { this.currentState = this.outlineStarState; }
  public void set_outlineHexagonState() { this.currentState = this.outlineHexagonState; }
}
