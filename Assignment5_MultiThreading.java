class Tab1 extends Thread {
    public void run() {
        System.out.println("Tab 1 Loading...");
    }
}

class Tab2 extends Thread {
    public void run() {
        System.out.println("Tab 2 Loading...");
    }
}

class Tab3 extends Thread {
    public void run() {
        System.out.println("Tab 3 Loading...");
    }
}

public class Assignment5_MultiThreading {
    public void startTabs() {
        new Tab1().start();
        new Tab2().start();
        new Tab3().start();
    }
}