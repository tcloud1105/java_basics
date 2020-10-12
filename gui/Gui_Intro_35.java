package gui;

import javax.swing.*;
import java.awt.*;

public class Gui_Intro_35 extends JFrame {

    private JLabel item1;
     public Gui_Intro_35(){
        super("title of the frame");
        setLayout(new FlowLayout(1,10,20));

        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("this is gonna show up on hover");

        add(item1);
     }
}
