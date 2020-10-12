package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox_In_Action_38 extends JFrame {

    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public CheckBox_In_Action_38(){
        super("CheckBox in Action");
        setLayout(new FlowLayout());

        tf = new JTextField("this is a sentence", 20);
        tf.setFont(new Font("Serif",Font.PLAIN,14));
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);

        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
    }


    private class HandlerClass implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
             Font font = null;

             if(boldbox.isSelected() && italicbox.isSelected())
                 font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if(boldbox.isSelected() )
                 font = new Font("Serif", Font.BOLD, 14);
            else if(italicbox.isSelected() )
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN,14);

            tf.setFont(font);

        }
    }
}
