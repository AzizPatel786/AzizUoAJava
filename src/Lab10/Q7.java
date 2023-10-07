package Lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class NumberListDemo extends JFrame {
    DefaultListModel<Integer> listModel;
    JList<Integer> list;
    JList<String> groupList;
    ArrayList<Integer> odds = new ArrayList<Integer>();
    ArrayList<Integer> evens = new ArrayList<Integer>();

    public NumberListDemo() {
        odds = new ArrayList<Integer>();
        Collections.addAll(odds, 1, 3, 5, 7, 9, 11);
        evens = new ArrayList<Integer>();
        Collections.addAll(evens, 2, 4, 6, 8, 10);
        listModel = new DefaultListModel<Integer>();
        listModel.addAll(odds);
        groupList = new JList<String>(new String[]{"Odd", "Even"});
        list = new JList<Integer>(listModel);
        groupList.addListSelectionListener(new PopulateListener());
        JPanel panel = new JPanel();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, groupList, list);
        panel.add(splitPane);
        getContentPane().add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
    class PopulateListener  implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent arg0) {
            if (!arg0.getValueIsAdjusting()) {
                int selectedIndex = groupList.getSelectedIndex();

                if (selectedIndex == 0) {
                    listModel.clear();
                    listModel.addAll(odds);
                } else if (selectedIndex == 1) {
                    listModel.clear();
                    listModel.addAll(evens);
                }
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new NumberListDemo();}
        });
    }
}

public class Q7 {
}
