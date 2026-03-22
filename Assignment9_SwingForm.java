import javax.swing.*;

public class Assignment9_SwingForm {
    public JPanel getForm() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("URL:"));
        panel.add(new JTextField(20));
        return panel;
    }

    public static void main(String[] args) {
        Assignment9_SwingForm obj = new Assignment9_SwingForm();

        JFrame frame = new JFrame("Swing Form");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(obj.getForm());

        frame.setVisible(true);
    }
}
