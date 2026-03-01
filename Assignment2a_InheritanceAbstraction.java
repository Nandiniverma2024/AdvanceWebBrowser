abstract class BrowserBase {
    abstract void openBrowser();
}

public class Assignment2a_InheritanceAbstraction extends BrowserBase {
    public void openBrowser() {
        System.out.println("Browser opened using Abstraction & Inheritance");
    }
}