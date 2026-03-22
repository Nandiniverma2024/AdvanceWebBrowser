import java.io.*;

public class Assignment6_StreamDemo {
    public void saveHistory(String url) {
        try {
            FileWriter fw = new FileWriter("history.txt", true);
            fw.write(url + "\n");
            fw.close();

            System.out.println("Saved URL: " + url);

        } catch (Exception e) {
            System.out.println("File Error");
        }
    }

    public static void main(String[] args) {
        Assignment6_StreamDemo obj = new Assignment6_StreamDemo();
        obj.saveHistory("https://google.com");
        obj.saveHistory("https://github.com");

        System.out.println("History saved successfully!");
    }
}
