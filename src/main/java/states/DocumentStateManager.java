package states;

import controllers.*;

public class DocumentStateManager
{
  private State currentState;

  private SelectState selectState;
  private RectangleState rectangleState;
  private TriangleState triangleState;
  private StarState starState;
  private HexagonState hexagonState;

  public DocumentStateManager(DocumentController mediator)
  {
    selectState = new SelectState();
    rectangleState = new RectangleState();
    triangleState = new TriangleState();
    starState = new StarState();
    hexagonState = new HexagonState();

    currentState = selectState;
  }

  public State get_currentState() { return this.currentState; }

  public void set_selectState() { this.currentState = this.selectState; }
  public void set_rectangleState() { this.currentState = this.rectangleState; }
  public void set_triangleState() { this.currentState = this.triangleState; }
  public void set_starState() { this.currentState = this.starState; }
  public void set_hexagonState() { this.currentState = this.hexagonState; }
}
