package td.td2.ex4.q1;

import java.util.Random;

public class Producteur implements Runnable {
    private final Buffer buf;
    private final Random gen = new Random();
    private int nbDepots = 0;
    private final int nbAFaire;
    
    public Producteur(Buffer b, int nbAFaire) {
        buf = b;
        this.nbAFaire = nbAFaire;
    }

    @Override
    public void run() {
        int val;
        for (int i = 0; i < nbAFaire; i++) {
            val = gen.nextInt(10);
            try {
                buf.depot(val);
                System.out.println("Depot " + ++nbDepots + " correct: " + val);
            } catch (FullBufferException e) {
                System.out.println("Echec au depot: le buffer est plein");
            }
            System.out.println(buf.toString());
        }
    }
}
