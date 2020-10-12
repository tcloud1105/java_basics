package gui;

import javax.swing.*;
import java.awt.*;

public class Gui_Main {
    public static void main(String[] args){

        JFrame g = new JFrame("Drawing object");
        Drawing_Graphics_2_53 d = new Drawing_Graphics_2_53();
        g.add(d);
      g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      g.setSize(new Dimension(400,300));
      g.setVisible(true);

    }
}
