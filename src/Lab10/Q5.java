package Lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

enum ChineseZodiac { HARE(2023), DRAGON(2024), SNAKE(2025), HORSE(2026), SHEEP(2027), MONKEY(2028), ROOSTER(2029), DOG(2030), PIG(2031), RAT(2032), OX(2033), TIGER(2034);
    private int year;
    private ChineseZodiac(int value) { year = value; }
    public int getYear() { return year; }
}
class ChineseZodiacDemo extends JFrame  {
    JList<ChineseZodiac> list;
    JLabel resultLabel;

    public ChineseZodiacDemo() {
        list = new JList<ChineseZodiac>(ChineseZodiac.values());
        list.addListSelectionListener(new SelectListener());
        JPanel input_panel = new JPanel();
        resultLabel = new JLabel("The year of ...");
        input_panel.add(resultLabel);
        getContentPane().add(input_panel, BorderLayout.SOUTH);
        getContentPane().add(new JScrollPane(list), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    class SelectListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent arg0) {
            if (!arg0.getValueIsAdjusting()) {
                ChineseZodiac selectedZodiac = list.getSelectedValue();
                int selectedYear = selectedZodiac.getYear();
                resultLabel.setText("The year of " + selectedZodiac + " is " + selectedYear + ".");
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChineseZodiacDemo();
            }
        });
    }
}

public class Q5 {
}
