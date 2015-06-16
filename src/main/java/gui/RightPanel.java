package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.JToolBar;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.SwingConstants;

import actions.PlaceholderAction;

import actions.RectangleStateAction;
import actions.TriangleStateAction;
import actions.StarStateAction;
import actions.HexagonStateAction;
import actions.OutlineRectangleStateAction;
import actions.OutlineTriangleStateAction;
import actions.OutlineStarStateAction;
import actions.OutlineHexagonStateAction;
import actions.SelectStateAction;
import actions.ColorPickerAction;

import java.net.URL;

public class RightPanel extends JPanel implements ActionListener
{
	//commands for buttons
	static final private String CLICK = "click";

  public RightPanel()
  {
	  super(new BorderLayout());

	  JToolBar RightPanel = new JToolBar("Graphics Pallete");
	  RightPanel.setOrientation(SwingConstants.VERTICAL);
      addButtons(RightPanel);

      setPreferredSize(new Dimension(60, 300));
      add(RightPanel, BorderLayout.PAGE_START);
      add(RightPanel, BorderLayout.CENTER);

      RightPanel.setRollover(true);

      this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
  }

  protected void addButtons(JToolBar RightPanel) {
	  JButton button = null;
	  RightPanel.add(Box.createVerticalStrut(10));

	//first button
       button = outlineHexagonStateButton("Hexagon", CLICK, "Hexagon", "btn 1");
       RightPanel.add(button);
       RightPanel.add(Box.createVerticalStrut(10));

	//second button
       button = outlineRectangleStateButton("Rectangle", CLICK, "Rectangle", "btn 2");
       RightPanel.add(button);
	   RightPanel.add(Box.createVerticalStrut(10));

  	//third button
        button = outlineStarStateButton("Star", CLICK, "Star", "btn 3");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //fourth button
        button = outlineTriangleStateButton("Triangle", CLICK, "Triangle", "btn 4");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //fifth button
        button = colorPickerButton("Color Picker", CLICK, "Color Picker", "btn 5");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //sixth button
        button = hexagonStateButton("Hexagon Colored", CLICK, "Hexagon Colored", "btn 6");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //seventh button
        button = rectangleStateButton("Rectangle Colored", CLICK, "Rectangle Colored", "btn 7");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //eight button
        button = starStateButton("Star Colored", CLICK, "Star Colored", "btn 8");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //ninth button
        button = triangleStateButton("Triangle Colored", CLICK, "Triangle Colored", "btn 9");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));

    //tenth button
        button = selectStateButton("Select", CLICK, "Select", "btn 10");
        RightPanel.add(button);
        RightPanel.add(Box.createVerticalStrut(10));
 }

  protected JButton makeNavigationButton(String imageName, String actionCommand, String toolTipText, String altText) {

	  PlaceholderAction action = new PlaceholderAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg", altText));
	  JButton button = new JButton(action);
	  button.setText("");
		button.setToolTipText(toolTipText);
		button.setPreferredSize(new Dimension(30, 30));

		return button;
  }

  protected JButton rectangleStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

    RectangleStateAction action = new RectangleStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
    JButton button = new JButton(action);
    button.setText("");
    button.setToolTipText(toolTipText);
    button.setPreferredSize(new Dimension(30, 30));

    return button;
  }

  protected JButton outlineRectangleStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    OutlineRectangleStateAction action = new OutlineRectangleStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
	  }

  protected JButton triangleStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    TriangleStateAction action = new TriangleStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
  }

  protected JButton outlineTriangleStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    OutlineTriangleStateAction action = new OutlineTriangleStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
}

  protected JButton starStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    StarStateAction action = new StarStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
}

  protected JButton outlineStarStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    OutlineStarStateAction action = new OutlineStarStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
}

  protected JButton hexagonStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    HexagonStateAction action = new HexagonStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
}

  protected JButton outlineHexagonStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    OutlineHexagonStateAction action = new OutlineHexagonStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
}

  protected JButton selectStateButton(String imageName, String actionCommand, String toolTipText, String altText) {

    SelectStateAction action = new SelectStateAction(imageName, new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
    JButton button = new JButton(action);
    button.setText("");
    button.setToolTipText(toolTipText);
    button.setPreferredSize(new Dimension(30, 30));

    return button;
  }
  
  protected JButton colorPickerButton(String imageName, String actionCommand, String toolTipText, String altText) {

	    ColorPickerAction action = new ColorPickerAction(new ImageIcon("images/Right Panel/" + imageName + ".jpg"));
	    JButton button = new JButton(action);
	    button.setText("");
	    button.setToolTipText(toolTipText);
	    button.setPreferredSize(new Dimension(30, 30));

	    return button;
	  }

  public void actionPerformed(ActionEvent e) {
      String cmd = e.getActionCommand();

      // handles buttons with set action command
      if (CLICK.equals(cmd)) {
    	  JOptionPane.showMessageDialog(null, "Click!");
      }
  }

  //END
}

