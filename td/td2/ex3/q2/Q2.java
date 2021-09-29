/**
 * Proposez un programme qui lance trois threads affichant chacun “Hello World”, en passant par une sous-classe de Thread. Quel est l’inconve ́nient de cette solution?
 * 
 * The inconvenience is that, by using inheritance of the Thread class, we lose the ability to inherit from other different class.
 */

package td.td2.ex3.q2;

class HelloWorld extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

public class Q2 {
    public static void main(String[] args) {
        HelloWorld[] hw = new HelloWorld[3];
        for (int i = 0; i < 3; i++) {
            hw[i] = new HelloWorld();
            hw[i].start();
        }
    }
}
