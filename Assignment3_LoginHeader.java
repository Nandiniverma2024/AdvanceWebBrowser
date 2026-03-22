public class Assignment3_LoginHeader {

    public String getHeader(String name) {
        return "Welcome " + name + " to Advanced Web Browser";
    }

    public static void main(String[] args) {
        Assignment3_LoginHeader obj = new Assignment3_LoginHeader();
        
        String result = obj.getHeader("Alex");
        System.out.println(result);
    }
}
