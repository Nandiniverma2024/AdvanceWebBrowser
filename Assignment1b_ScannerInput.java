import java.util.Scanner;

public class Assignment1b_ScannerInput {
    Scanner sc = new Scanner(System.in);

    public String getUserName() {
        System.out.print("Enter User Name: ");
        return sc.nextLine();
    }
}