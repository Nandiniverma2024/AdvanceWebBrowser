import javax.swing.*;

public class Assignment9_SwingForm {
    public JPanel getForm() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("URL:"));
        panel.add(new JTextField(20));
        return panel;
    }
}