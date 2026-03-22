import java.util.Scanner;

public class Assignment1b_ScannerInput {

    Scanner sc = new Scanner(System.in);

    public String getUserName() {
        System.out.print("Enter User Name: ");
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Assignment1b_ScannerInput obj = new Assignment1b_ScannerInput();
        String name = obj.getUserName();
        System.out.println("Hello " + name);
    }
}
