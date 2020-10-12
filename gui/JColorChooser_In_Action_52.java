package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooser_In_Action_52 extends JFrame{
    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public JColorChooser_In_Action_52(){
        super("JColorChooser In Action");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Choose a color");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(null,"pick your color",color);
               if(color==null){
                 color = (Color.WHITE);
               }
               panel.setBackground(color);
            }
        });
        add(panel, BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);

    }


}
