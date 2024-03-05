package bookmyShow1;

public class PaymentException extends Exception{
    String payment;
    public PaymentException(String message, String paymentFailed) {
        super(message);
        this.payment=paymentFailed;
    }
    public String getPayment() {
        return payment;
    }
}
