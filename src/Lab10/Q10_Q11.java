package Lab10;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Student {
    private String name, username;
    public Student(String name, String username) {
        this.name = name;
        this.username = username;
    }
    public String toString() { return String.format("%s(%s)", name, username); }
    public String getUsername() { return username; }
    public String getName() { return name; }
}

// StudentListModel class

class StudentListDemo extends JFrame {
    JButton loadButton;
    StudentListModel<Student> listModel;
    JList<Student> list;
    JLabel resultLabel;
    JTextArea dataTextArea;
    public StudentListDemo() {
        listModel = new StudentListModel<Student>();
        listModel.addElement(new Student("Smith,Dick", "sdic123"));
        listModel.addElement(new Student("Hill,Michael", "mhil005"));
        listModel.addElement(new Student("Chan,Bob", "bcha105"));
        list = new JList<Student>(listModel);
        loadButton = new JButton("Load");
        dataTextArea = new JTextArea(4, 10);
        dataTextArea.setText("Lee,May mlee54\nKim,Albert akim256\nZhang,Alice azha002");
        resultLabel = new JLabel("The username is ...");
        loadButton.addActionListener(new LoadListener());
        list.addListSelectionListener(new SelectListener());
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(loadButton);
        buttonsPanel.add(resultLabel);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, dataTextArea, list);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
        getContentPane().add(splitPane, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setVisible(true);
    }

    class LoadListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class SelectListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent arg0) {
            if (!arg0.getValueIsAdjusting()) {

            }
        }
    }

    class SelectListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                Student selectedStudent = list.getSelectedValue();
                if (selectedStudent != null) {
                    resultLabel.setText("The username is " + selectedStudent.getUsername());
                }
            }
        }
    }
    class LoadListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Student> students = new ArrayList<>();
            String[] s = dataTextArea.getText().split("\n");

            for (String l:s) {
                String[] sp = l.split("\\(");
                if (sp.length == 2) {
                    Student st = new Student(sp[0], sp[1].replace(")", ""));
                    students.add(st);
                }
            }
            listModel.addAll(students);
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new StudentListDemo();}
        });
    }
}

public class Q10_Q11 {
    public static void main(String[] args) {

    }
}
