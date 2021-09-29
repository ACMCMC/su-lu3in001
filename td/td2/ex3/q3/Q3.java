/**
 * Reprenez le programme pre ́ce ́dent en utilisant cette fois une classe qui n’est pas une sous-classe de Thread.
 */

package td.td2.ex3.q3;

class HelloWorld implements Runnable {
    public void run() {
        System.out.println("Hello World!");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Thread[] hw = new Thread[3];
        for (int i = 0; i < hw.length; i++) {
            hw[i] = new Thread(new HelloWorld());
            hw[i].start();
        }
    }
}
