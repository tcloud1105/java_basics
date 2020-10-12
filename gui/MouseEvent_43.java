package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvent_43 extends JFrame {
    private JPanel mousepanel;
    private JLabel statusbar;

    public MouseEvent_43(){
        super("Mouse Event");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

       HandlerClass handler = new HandlerClass();
       mousepanel.addMouseListener(handler);
       mousepanel.addMouseMotionListener(handler);

    }

    private class HandlerClass implements MouseListener, MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent e) {
           statusbar.setText(String.format("Clicked at %d %d",e.getX(),e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusbar.setText("you pressed down the mouse");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusbar.setText("you released the mouse");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusbar.setText("you entered the area");
            mousepanel.setBackground(Color.RED);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusbar.setText("you exited the area");
            mousepanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
           statusbar.setText("you are dragging the mouse");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusbar.setText("you are moving the mouse");
        }
    }
}
