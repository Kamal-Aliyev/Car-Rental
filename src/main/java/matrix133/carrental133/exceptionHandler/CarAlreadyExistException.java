package matrix133.carrental133.exceptionHandler;

public class CarAlreadyExistException extends RuntimeException {
    private String message;
    public CarAlreadyExistException() {
        super();
    }

    public CarAlreadyExistException(String message) {
        super(message);
        this.message =message;
    }
}
