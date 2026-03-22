import java.awt.*;
import java.awt.event.*;

public class Assignment8_AWTMessage extends Frame {

    public Assignment8_AWTMessage() {
        setTitle("AWT Message");
        setSize(300, 200);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Advanced Web Browser", 50, 100);
    }

    public static void main(String[] args) {
        new Assignment8_AWTMessage();
    }
}
