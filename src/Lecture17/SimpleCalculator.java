package Lecture17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField textField1, textField2, textField3;
    private JButton addButton;
    public SimpleCalculator() {
        textField1 = new JTextField(4);
        textField2 = new JTextField(6);
        textField3 = new JTextField(4);
        addButton = new JButton("+");
        addButton.addActionListener( new MyListener() );
    }
    class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            textField3.setText(String.valueOf(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText())));
        }
    }
}