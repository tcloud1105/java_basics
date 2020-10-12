package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Multiple_Selection_List_42 extends JFrame {

    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private  static String[] foods = {"rice","chicken","beans","beef","bread"};

    public Multiple_Selection_List_42(){
        super("Multiple Selection List In Action");
        setLayout(new FlowLayout());

        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("Move -->");
        movebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightlist.setListData( leftlist.getSelectedValues());
            }
        });
        add(movebutton);

        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellHeight(15);
        rightlist.setFixedCellWidth(100);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        this.add(new JScrollPane(rightlist));
    }



}
