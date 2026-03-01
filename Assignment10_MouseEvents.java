import java.awt.event.*;
import javax.swing.*;

public class Assignment10_MouseEvents extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Mouse Clicked!");
    }
}
