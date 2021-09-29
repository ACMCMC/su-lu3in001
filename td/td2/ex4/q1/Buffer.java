package td.td2.ex4.q1;

public class Buffer {
    private final int[] tableau;
    private int nbElements = 0;

    public Buffer(int taille) {
        tableau = new int[taille];
    }

    public void depot(int val) throws FullBufferException {
        if (nbElements == tableau.length) {
            throw new FullBufferException();
        }
        tableau[nbElements++] = val;
    }

    public int retrait() throws EmptyBufferException {
        if (nbElements == 0) {
            throw new EmptyBufferException();
        }
        return tableau[--nbElements];
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for (int i = 0; i < tableau.length; i++) {
            sb.append(Integer.toString(tableau[i]));
            sb.append("|");
        }
        return sb.toString();
    }
}
