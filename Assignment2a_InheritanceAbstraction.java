abstract class BrowserBase {
    abstract void openBrowser();
}

public class Assignment2a_InheritanceAbstraction extends BrowserBase {
    
    public void openBrowser() {
        System.out.println("Browser opened using Abstraction & Inheritance");
    }

    public static void main(String[] args) {
        Assignment2a_InheritanceAbstraction obj = new Assignment2a_InheritanceAbstraction();
        obj.openBrowser();
    }
}
