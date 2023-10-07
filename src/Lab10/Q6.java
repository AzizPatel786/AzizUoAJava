package Lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class PetListDemo extends JFrame {
    JButton addButton, removeButton;
    JTextField nameTextField;
    DefaultListModel<String> listModel;
    JList<String> petList;

    public PetListDemo() {
        listModel = new DefaultListModel<String>();
        String[] names = new String[]{"cat", "dog"};
        for (String c: names) listModel.addElement(c);
        petList = new JList<String>(listModel);
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        nameTextField = new JTextField("Frog");
        addButton.addActionListener(new AddListener());
        removeButton.addActionListener(new RemoveListener());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(nameTextField);
        buttonsPanel.add(addButton);
        buttonsPanel.add(removeButton);
        getContentPane().add(buttonsPanel, BorderLayout.NORTH);
        getContentPane().add(petList, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            listModel.addElement(nameTextField.getText());
        }
    }
    class RemoveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (petList.getSelectedIndex() > -1)
                listModel.removeElementAt(petList.getSelectedIndex());
        }
    }


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { new PetListDemo();}
        });
    }
}

public class Q6 {
}
