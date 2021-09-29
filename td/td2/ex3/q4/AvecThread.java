package td.td2.ex3.q4;

class HelloWorldThread extends Thread {
    private final int id;
    private final String ville;
    private static int count = 1;

    HelloWorldThread(String ville) {
        this.id = count++;
        this.ville = ville;
    }

    public void run() {
        System.out.println("thread " + Integer.toString(id) + " salue " + ville);
    }
}

public class AvecThread {
    public static void main(String[] args) {
        HelloWorldThread[] helloWorldThreads = new HelloWorldThread[3];
        helloWorldThreads[0] = new HelloWorldThread("Paris");
        helloWorldThreads[1] = new HelloWorldThread("Lyon");
        helloWorldThreads[2] = new HelloWorldThread("Marseille");
        for (HelloWorldThread helloWorldThread : helloWorldThreads) {
            helloWorldThread.start();
        }
    }
}
