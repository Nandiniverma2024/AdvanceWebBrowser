public class Assignment2b_MethodOverloading {

    public void loadPage(String url) {
        System.out.println("Loading URL: " + url);
    }

    public void loadPage(String url, int speed) {
        System.out.println("Loading URL: " + url + " with speed " + speed);
    }

    public static void main(String[] args) {
        Assignment2b_MethodOverloading obj = new Assignment2b_MethodOverloading();
        
        obj.loadPage("https://google.com");
        obj.loadPage("https://youtube.com", 5);
    }
}
