import java.awt.event.*;

public class Assignment11_KeyEvents extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }
}