package gui;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Event_Handler_36 extends JFrame {
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public Event_Handler_36(){
        super("Event Handler");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 = new JTextField("uneditable",20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("pass");
        add(passwordField);

        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }


    private class TheHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String string = " ";

            if(e.getSource() == item1)
                string = String.format("field 1: %s", e.getActionCommand());
            else if(e.getSource() == item2)
                string = String.format("field 2: %s", e.getActionCommand());
            else if(e.getSource() == item3)
                string = String.format("field 3: %s", e.getActionCommand());
            else if(e.getSource() == passwordField)
                string = String.format("field 4: %s", e.getActionCommand());

            JOptionPane.showMessageDialog(null,string);
        }
    }
}
