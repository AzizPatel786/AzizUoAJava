package Lecture17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressMeDemo extends JFrame {
    JTextField textField1;
    JButton pressButton;
    String[] messages = new String[]{"YOU RANG!", "NOT NOW!", "MAYBE LATER!"};
    int count;

    public PressMeDemo() {
        textField1 = new JTextField(10);
        pressButton = new JButton("PRESS ME");
        pressButton.addActionListener(new MyListener());
        count = 0;

        // Add components to the JFrame
        // ...

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            int index = (count - 1) % messages.length;
            textField1.setText(messages[index]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PressMeDemo());
    }
}