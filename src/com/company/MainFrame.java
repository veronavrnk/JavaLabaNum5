package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame extends JComponent implements KeyListener, ActionListener {
    private int z = 0, y = 0, H = 40, W = 40;
    Rectangle rectangle = new Rectangle(z, y, W, H);
    Timer t = new Timer(5,this);

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        JFrame f = new JFrame("TEST");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLocation(500, 150);
        f.add(mainFrame);
        f.addKeyListener(mainFrame);
    }

public void paint(Graphics g) {
    Graphics2D g1 = (Graphics2D)g;
    g1.fill(rectangle);
    t.start();
}
public void actionPerformed(ActionEvent e) {
        repaint();

}

public void keyTyped(KeyEvent e) {}

public void keyPressed(KeyEvent e){
    if (e.getKeyCode()==KeyEvent.VK_RIGHT){
        rectangle.setLocation(rectangle.x+1,rectangle.y);
    }
    if (e.getKeyCode()==KeyEvent.VK_DOWN){
        rectangle.setLocation(rectangle.x,rectangle.y+1);
    }
    if (e.getKeyCode()==KeyEvent.VK_LEFT){
        rectangle.setLocation(rectangle.x-1,rectangle.y);
    }
    if (e.getKeyCode()==KeyEvent.VK_UP){
        rectangle.setLocation(rectangle.x,rectangle.y-1);
    }

}

public void keyReleased(KeyEvent e){
}
}