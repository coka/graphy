package graphy.extra.windows;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import gui.MainWindow;

public class DiagramRename extends JDialog{

  public DiagramRename(Frame parent, boolean modal){
    super();
    setTitle("Rename Document");
    setVisible(true);

    setSize(300,130);
    setLocationRelativeTo(parent);

    this.setLayout(new BorderLayout());

    //text
    JPanel topPanel = new JPanel();
    topPanel.add(new JLabel("Enter new document name:"));

    //input text area
    JPanel middlepanel = new JPanel();
    final JTextField textField = new JTextField(30);

    String textForInput = MainWindow.get_instance().centerPanel.getSelectedFrame().getTitle();
    textField.setText(textForInput);

    middlepanel.add(textField);

    //buttons
    JPanel buttons = new JPanel();
    buttons.setLayout(new FlowLayout(FlowLayout.CENTER));

    JButton buttonRename = new JButton("Rename");
    JButton buttonCancel = new JButton("Cancel");

    buttonRename.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {

        String text = textField.getText();
        MainWindow.get_instance().centerPanel.getSelectedFrame().setTitle(text);

      }
    });

    buttonCancel.addActionListener(new CloseListener());
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    buttons.add(buttonRename);
    buttons.add(buttonCancel);

    this.add(topPanel, BorderLayout.NORTH);
    this.add(middlepanel, BorderLayout.CENTER);
    this.add(buttons, BorderLayout.SOUTH);

    ImageIcon img = new ImageIcon("images/Logo.png");
    this.setIconImage(img.getImage());

  }

  class CloseListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      setVisible(false);
      dispose();
    }
  }
}
