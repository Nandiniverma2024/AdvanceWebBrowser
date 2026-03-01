import java.awt.*;

public class Assignment8_AWTMessage extends Frame {
    public Assignment8_AWTMessage() {
        setTitle("AWT Message");
        setSize(300,200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Advanced Web Browser", 50, 100);
    }
}