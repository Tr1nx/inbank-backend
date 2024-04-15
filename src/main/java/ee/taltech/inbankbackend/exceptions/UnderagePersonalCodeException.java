package ee.taltech.inbankbackend.exceptions;

public class UnderagePersonalCodeException extends Throwable{
    private final String message;
    private final Throwable cause;


    public  UnderagePersonalCodeException(String message) {
        this(message, null);
    }

    public UnderagePersonalCodeException(String message, Throwable cause) {
        this.message = message;
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
