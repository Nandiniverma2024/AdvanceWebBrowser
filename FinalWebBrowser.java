import java.awt.*;
import javax.swing.*;

public class FinalWebBrowser extends JFrame {

    JTextField urlField;
    JEditorPane webPane;

    Assignment1a_DisplayText a1 = new Assignment1a_DisplayText();
    Assignment1b_ScannerInput a2 = new Assignment1b_ScannerInput();
    Assignment2a_InheritanceAbstraction a3 = new Assignment2a_InheritanceAbstraction();
    Assignment2b_MethodOverloading a4 = new Assignment2b_MethodOverloading();
    Assignment3_LoginHeader a5 = new Assignment3_LoginHeader();
    Assignment4_PackageDemo a6 = new Assignment4_PackageDemo();
    Assignment5_MultiThreading a7 = new Assignment5_MultiThreading();
    Assignment6_StreamDemo a8 = new Assignment6_StreamDemo();
    Assignment7_ExceptionHandling a9 = new Assignment7_ExceptionHandling();

    public FinalWebBrowser(String user) {

        setTitle("Advanced Web Browser - MCA Project");
        setSize(900,600);
        setLayout(new BorderLayout());

        // Header
        JLabel header = new JLabel(a5.getHeader(user), JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        header.setBackground(Color.LIGHT_GRAY);
        header.setOpaque(true);
        add(header, BorderLayout.NORTH);

        // URL Panel
        JPanel topPanel = new JPanel(new BorderLayout());
        urlField = new JTextField("https://www.google.com");
        JButton goBtn = new JButton("GO");

        topPanel.add(urlField, BorderLayout.CENTER);
        topPanel.add(goBtn, BorderLayout.EAST);
        add(topPanel, BorderLayout.SOUTH);

        // Web Area
        webPane = new JEditorPane();
        webPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(webPane);
        add(scrollPane, BorderLayout.CENTER);

        // Events
        goBtn.addActionListener(e -> loadPage());
        goBtn.addMouseListener(new Assignment10_MouseEvents());
        urlField.addKeyListener(new Assignment11_KeyEvents());

        // Call other assignments
        a1.displayText();
        a3.openBrowser();
        a6.showPackage();
        a7.startTabs();
        a9.handleException();
        new Assignment8_AWTMessage();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void loadPage() {
        try {
            String url = urlField.getText();

            if (!url.startsWith("http")) {
                url = "https://" + url;
            }

            webPane.setPage(url);   // REAL WEBSITE LOAD
            a4.loadPage(url);
            a8.saveHistory(url);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Invalid URL");
        }
    }

    public static void main(String[] args) {
        Assignment1b_ScannerInput sc = new Assignment1b_ScannerInput();
        String user = sc.getUserName();
        new FinalWebBrowser(user);
    }
}
