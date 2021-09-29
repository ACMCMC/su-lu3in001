package td.td2.ex4.q1;

public class Consommeur implements Runnable {
    private int nbConsommations = 0;
    private final Buffer buf;
    private final int nbAFaire;
    
    public Consommeur(Buffer buf, int nbAFaire) {
        this.nbAFaire = nbAFaire;
        this.buf = buf;
    }

    @Override
    public void run() {
        int val;
        for (int i = 0; i < nbAFaire; i++) {
            try {
                val = buf.retrait();
                System.out.println("Retrait " + ++nbConsommations + " correct: " + val);
            } catch (EmptyBufferException e) {
                System.out.println("Echec au retrait: le buffer est vide");
            }
            System.out.println(buf.toString());
        }
    }
}
