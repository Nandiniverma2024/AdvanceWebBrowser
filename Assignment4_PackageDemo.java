import java.util.Date;

public class Assignment4_PackageDemo {
    public void showPackage() {
        Date d = new Date();
        System.out.println("Using Inbuilt Package java.util.Date: " + d);
    }

    public static void main(String[] args) {
        Assignment4_PackageDemo obj = new Assignment4_PackageDemo();
        obj.showPackage();
    }
}
