package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button_In_Action_37 extends JFrame {

    private JButton reg;
    private JButton custom;

    public Button_In_Action_37(){
        super("Button In action");
        setLayout(new FlowLayout());

        reg = new JButton("Registration");
        add(reg);

        Icon b = new ImageIcon(getClass().getResource("b.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));

        custom = new JButton("Custom",b);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }
 private class HandlerClass implements ActionListener{

     @Override
     public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(null, String.format("%s",e.getActionCommand()));
     }
 }











}
