package td.td2.ex3.q1;

public class Q1 {
    public static void main(String[] args) {
        Thread th = new Thread() {
            public void run() {
                System.out.println("Hello from the child");
            }
        };
        th.start();
        Thread.yield();
        System.out.println("Hello from the parent thread");
    }
}