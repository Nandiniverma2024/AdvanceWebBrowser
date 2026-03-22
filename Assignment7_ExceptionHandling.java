public class Assignment7_ExceptionHandling {
    public void handleException() {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception Handled Successfully");
        }
    }

    public static void main(String[] args) {
        Assignment7_ExceptionHandling obj = new Assignment7_ExceptionHandling();
        obj.handleException();
    }
}
