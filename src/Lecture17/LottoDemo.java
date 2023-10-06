package Lecture17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LottoDemo extends JFrame {
    JTextField textField1;
    JButton pressButton;
    Random rand = new Random(30);
    public LottoDemo() {
        textField1 = new JTextField(10);
        pressButton = new JButton("RANDOM LOTTO NUMBERS");
        pressButton.addActionListener(new MyListener());
        // Add components to the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder lottoNumbers = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int number = rand.nextInt(40) + 1;
                lottoNumbers.append(number);
                if (i < 5) {
                    lottoNumbers.append(" ");
                }
            }
            textField1.setText(lottoNumbers.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LottoDemo());
    }
}

