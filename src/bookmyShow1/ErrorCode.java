package bookmyShow1;

public enum ErrorCode {
    Payment_Failed("Payment_Failed");
    String message;

    ErrorCode(String message) {
        this.message = message;
    }
}
