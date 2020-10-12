package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout_50 extends JFrame {
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public Layout_50(){
        super("FlowLayout");
        layout = new FlowLayout();
        container = getContentPane();

        // left button
        lb = new JButton("left");
        add(lb);
        lb.addActionListener(e -> { // lambda expression
            layout.setAlignment(FlowLayout.LEFT);
            layout.layoutContainer(container);
        });
        // center button
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(e -> {
            layout.setAlignment(FlowLayout.CENTER);
            layout.layoutContainer(container);
        });

        // right button
        rb = new JButton("right");
        add(rb);
        rb.addActionListener(e -> {
            layout.setAlignment(FlowLayout.RIGHT);
            layout.layoutContainer(container);
        });
    }
}
