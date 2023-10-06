package Lab08;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

class MySquare {
    protected int sideLength=1;
    public MySquare() { this(1); }
    public MySquare(int s) { sideLength = s; }
    public int getSideLength() { return sideLength; }
    public int getArea() { return sideLength * sideLength; }
    public String toString() { return String.format("%s:area=%d", getClass().getName(), getArea()); }
}
enum ChineseZodiac { HARE(2023), DRAGON(2024), SNAKE(2025), HORSE(2026), SHEEP(2027), MONKEY(2028), ROOSTER(2029), DOG(2030), PIG(2031), RAT(2032), OX(2033), TIGER(2034);
    private int year;
    private ChineseZodiac(int value) { year = value; }
    public int getYear() { return year; }
}
enum ZooEntranceFee {
    ADULT(25), CHILD(12),SENIOR(15),STUDENT(20),TODDLER(0);
    private final double feeAmount;
    private ZooEntranceFee(double feeAmount) {
        this.feeAmount = feeAmount;
    }
    public double getTotal(int numberOfTickets) {
        return feeAmount * numberOfTickets ;
    }
}
class MySubLine extends Point {
    Point pt2;
    public MySubLine() {this(0,0,0,0); }
    public MySubLine(Point p) { this(0, 0, p.x, p.y); }
    public MySubLine(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        pt2 = new Point(x2, y2);
    }
    public String toString() { return String.format("(%d, %d) to (%d, %d)", x, y, pt2.x, pt2.y); }
    public double getLength() { return  distance(pt2); }
}
public class GUIProgram extends JFrame {
//    private JTextField radiusField; private JButton calculateButton; private JLabel resultLabel;
//    private JTextField upiField; private JButton getButton;
//    private List<MySquare> list = new ArrayList<MySquare>(); private JTextField sideLengthField; private JButton createButton; private JTextArea resultTextArea;
//    private JList<ChineseZodiac> list; private JLabel resultLabel;
//    private JList<ZooEntranceFee> list; private JTextField quantityTextField; private JLabel resultLabel;
    private JLabel pointLabel; private JPanel contents;
    public GUIProgram() {
        // Question 7
//        radiusField = new JTextField("1", 10);
//        calculateButton = new JButton("Calculate");
//        resultLabel = new JLabel("The volume is ...");
        //Question 8
//        upiField = new JTextField("abcd100", 7);
//        getButton = new JButton("Get");
//        resultLabel = new JLabel("The number is ...");
        // Question 9
//        sideLengthField = new JTextField("1");
//        resultTextArea = new JTextArea(5, 5);
//        createButton = new JButton("Create");
        // Question 10
//        resultLabel = new JLabel("The Zodiac animal is ...");
//        list = new JList<ChineseZodiac>(ChineseZodiac.values());
//        list.addListSelectionListener( new MyListener() );
        // Question 11
//        resultLabel = new JLabel("The admission cost is ...");
//        quantityTextField = new JTextField("1", 5);
//        list = new JList<ZooEntranceFee>(ZooEntranceFee.values());
//        list.addListSelectionListener( new MyListener() );
        // Question 12
        pointLabel = new JLabel("(0, 0) to (0, 0)");
        contents = new JPanel();
        contents.addMouseListener(new MyMouseAdapter());
    }
    // Question 7
//    public class MyListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                double rad = Integer.parseInt(radiusField.getText());
//                resultLabel.setText(String.format("The volume is %.2f", (4.0/3)*Math.PI*Math.pow(rad, 3)));
//            } catch (NumberFormatException ex) {
//                radiusField.setText("0");
//                resultLabel.setText("ERROR: Invalid value. Try again.");
//            }
//
//        }
//    }
    // Question 8
//    public class MyListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                String upi = upiField.getText();
//                int nums = Integer.parseInt(upi.substring(upi.length()-3));
//                resultLabel.setText("The number is " + nums + ".");
//            } catch (Exception ex) {
//                upiField.setText("");
//                resultLabel.setText("ERROR: Invalid username format! Try again.");
//            }
//
//        }
//    }
    // Question 9
//    public class MyListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                MySquare newSquare = new MySquare(Integer.parseInt(sideLengthField.getText()));
//                if (newSquare.getSideLength() < 0){
//                    sideLengthField.setText("");
//                }else {
//                    list.add(newSquare);
//                    resultTextArea.setText(list.toString());
//                }
//            } catch (NumberFormatException ex) {
//                sideLengthField.setText("");
//            }
//
//        }
//    }
    // Question 10
//    public class MyListener implements ListSelectionListener {
//        @Override
//        public void valueChanged(ListSelectionEvent e) {
//            ChineseZodiac animal = list.getSelectedValue();
//            int year = animal.getYear();
//            resultLabel.setText("The Zodiac animal of " + year + " is " + animal + ".");
//        }
//    }
    // Question 11
//    public class MyListener implements ListSelectionListener {
//        @Override
//        public void valueChanged(ListSelectionEvent e) {
//            int quantity = Integer.parseInt(quantityTextField.getText());
//            ZooEntranceFee ageGroup = list.getSelectedValue();
//            double price = ageGroup.getTotal(quantity);
//            resultLabel.setText(String.format("The admission cost is %.2f", price));
//        }
//    }
    // Question 12
    public class MyMouseAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent evt) {
            MySubLine subLine = new MySubLine(evt.getPoint());
            pointLabel.setText(subLine.toString());
        }
    }


}
class Q7 {
    public static void main(String[] args) {
    }
}
