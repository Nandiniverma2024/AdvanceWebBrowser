import java.awt.event.*;
import javax.swing.*;

public class Assignment10_MouseEvents extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Mouse Clicked!");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        Assignment10_MouseEvents obj = new Assignment10_MouseEvents();

        panel.addMouseListener(obj); // attach kiya event

        frame.add(panel);
        frame.setVisible(true);
    }
}
