package graphy.extra.windows;

import java.awt.*;
import javax.swing.*;

public class ColorPicker extends JDialog{
	
	public ColorPicker(Frame parent, boolean modal){
		super();
				
		//color picker		
		Color initialColor = Color.red;
	    Color newColor = JColorChooser.showDialog(null, "Color Picker", initialColor);
		
	}	
	
}

