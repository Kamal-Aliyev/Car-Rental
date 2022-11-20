package matrix133.carrental133.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CarNotFoundException extends Exception {

    private static final long serialVersionUID = -470180507998010368L;

    private String message;

    public CarNotFoundException() {
        super();
    }

    public CarNotFoundException(String message) {
        super(message);
        this.message =message;
    }

}