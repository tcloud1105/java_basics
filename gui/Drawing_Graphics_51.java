package gui;

import javax.swing.*;
import java.awt.*;

public class Drawing_Graphics_51 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25,25,100,30);

        g.setColor(new Color(83, 125, 48));
        g.fillRect(25,65 ,100,30);

        g.setColor(new Color(98, 48, 125));
        g.drawString("This a simple text",25,100);

    }
}
