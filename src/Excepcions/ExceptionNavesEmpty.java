package Excepcions;

public class ExceptionNavesEmpty extends RuntimeException {
    private static final String MESSAGE = "No hay naves.";

    public ExceptionNavesEmpty() {
        super(MESSAGE);
    }
}
