package td.td2.ex3.q4;

class HelloWorldRunnable implements Runnable {
    private int id;
    private static int count = 1;
    private String ville;

    HelloWorldRunnable(String ville) {
        this.ville = ville;
        this.id = count++;
    }

    public void run() {
        System.out.println("thread " + Integer.toString(id) + " salue " + ville);
    }
}

public class AvecRunnable {
    public static void main(String[] args) {
        HelloWorldRunnable[] helloWorldRunnables = new HelloWorldRunnable[3];
        helloWorldRunnables[0] = new HelloWorldRunnable("Paris");
        helloWorldRunnables[1] = new HelloWorldRunnable("Tokyo");
        helloWorldRunnables[2] = new HelloWorldRunnable("Londres");

        /**
         * THIS CAN ONLY BE USED IF THE RUNNABLES ARE NOT CREATED IN PARALLEL
         * 
         * If they are created in parallel, there may be race conditions, because the id is a static attribute.
        */

        for (int i = 0; i < helloWorldRunnables.length; i++) {
            Thread thread = new Thread(helloWorldRunnables[i]);
            thread.start();
        }
    }
}
