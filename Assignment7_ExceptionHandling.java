public class Assignment7_ExceptionHandling {
    public void handleException() {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception Handled Successfully");
        }
    }
}
