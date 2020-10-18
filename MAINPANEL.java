import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MAINPANEL extends JPanel implements KeyListener
{
    

    @Override
    public void keyPressed(KeyEvent e) {
        
        // Tastennummer
        int keyCode = e.getKeyCode();
        
        if (keyCode == KeyEvent.VK_SPACE) // Leertaste
        {
            // TODO Nächster Zustand
            
            // Alles neu malen
            repaint();
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
    public void paintComponent(Graphics g)
    {
        
        // Schwarzes Gehäuse
        g.setColor(Color.black);
        g.fillRect(50, 50, 100, 300);
        
        
        // Rot
        if (true) { // TODO
            g.setColor(Color.red);
        } else {
            g.setColor(Color.gray);
        }
        
        g.fillOval(70, 80, 60, 60);
        
        
        // Gelb
        if (false) { // TODO
            g.setColor(Color.yellow);
        } else {
            g.setColor(Color.gray);
        }
        
        g.fillOval(70, 170, 60, 60);
        
        
        // Grün
        if (false) { // TODO
            g.setColor(Color.green);
        } else {
            g.setColor(Color.gray);
        }
        
        g.fillOval(70, 260, 60, 60);
    }
  
}