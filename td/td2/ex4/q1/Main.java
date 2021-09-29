package td.td2.ex4.q1;

public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer(5);
        Producteur p = new Producteur(b, 10);
        Consommeur c = new Consommeur(b, 10);

        Thread thProducteur = new Thread(p);
        Thread thConsommeur = new Thread(c);
        thProducteur.start();
        thConsommeur.start();

        try {
            thProducteur.join();
            thConsommeur.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    
}
