package states;

import controllers.*;

public class DocumentStateManager
{
  private State currentState;

  private SelectState selectState;
  private RectangleState rectangleState;

  public DocumentStateManager(DocumentController mediator)
  {
    selectState = new SelectState();
    rectangleState = new RectangleState();

    currentState = selectState;
  }

  public State get_currentState() { return this.currentState; }

  public void set_selectState() { this.currentState = this.selectState; }
  public void set_rectangleState() { this.currentState = this.rectangleState; }
}
