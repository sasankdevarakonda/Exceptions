package bookmyshow;

public class PaymentException extends RuntimeException{

    public PaymentException(String message, String s) {
        super(message);
    }
}
