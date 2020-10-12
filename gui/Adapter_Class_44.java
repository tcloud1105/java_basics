package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Adapter_Class_44 extends JFrame {
    private String details;
    private JLabel statusbar;

    public Adapter_Class_44(){
        super("Adapter Class");

        statusbar = new JLabel("this is default");
        add(statusbar, BorderLayout.SOUTH);

        addMouseListener(new MouseClass());
    }

    private class MouseClass extends MouseAdapter {
        public void mouseClicked(MouseEvent event){
            details = String.format("You clicked %d ", event.getClickCount());

            if(event.isMetaDown()){
                details += "with right mouse button";
            }else if(event.isAltDown()){
                details +="either center mouse button";
            }else{
                details +="with left mouse button";
            }
            statusbar.setText(details);
        }
    }
}
