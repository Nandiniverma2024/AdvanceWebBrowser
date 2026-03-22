import java.awt.event.*;
import javax.swing.*;

public class Assignment11_KeyEvents extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);
        Assignment11_KeyEvents obj = new Assignment11_KeyEvents();

        textField.addKeyListener(obj); // attach kiya event

        frame.add(textField);
        frame.setVisible(true);
    }
}
