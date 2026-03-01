public class Assignment2b_MethodOverloading {
    public void loadPage(String url) {
        System.out.println("Loading URL: " + url);
    }

    public void loadPage(String url, int speed) {
        System.out.println("Loading URL: " + url + " with speed " + speed);
    }
}