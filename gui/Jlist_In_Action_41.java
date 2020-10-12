package gui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Jlist_In_Action_41 extends JFrame {

    private JList list;
    private static String[] colornames = {"black","blue","red","white"};
    private static Color[] colors = {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE};

    public Jlist_In_Action_41(){
        super("JList in Action");
        setLayout(new FlowLayout());

        list = new JList(colornames);// JList takes as parameter an array
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                getContentPane().setBackground(colors[list.getSelectedIndex()]);
            }
        });
    }

















}
