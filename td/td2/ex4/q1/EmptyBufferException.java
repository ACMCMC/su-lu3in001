package td.td2.ex4.q1;

public class EmptyBufferException extends Exception {
    public EmptyBufferException() {
        super("The buffer is empty.");
    }
}
