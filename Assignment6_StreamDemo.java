import java.io.*;

public class Assignment6_StreamDemo {
    public void saveHistory(String url) {
        try {
            FileWriter fw = new FileWriter("history.txt", true);
            fw.write(url + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("File Error");
        }
    }
}