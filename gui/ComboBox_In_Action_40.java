package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBox_In_Action_40 extends JFrame {
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"x.png","b.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};

    public ComboBox_In_Action_40(){
        super("ComboBox in Action");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);//automatically place the filename array in the ComboBox
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    picture.setIcon(pics[box.getSelectedIndex()]);
                }
            }
        });


        add(box);
        picture = new JLabel(pics[0]);
        add(picture);






    }

}
