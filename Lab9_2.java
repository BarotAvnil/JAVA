class A extends Thread {
    public static String txt;

    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("A: " + i);
            try {
                sleep(1000);
            } catch (Exception e) {
            
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 20; i += 2) {
            System.out.println("B: " + i);
            try {
                sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}

public class Lab9_2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // Start the thread
        b.start();
        a.start();
    }

}
