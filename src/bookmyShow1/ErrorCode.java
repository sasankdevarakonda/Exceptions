package bookmyShow1;

public enum ErrorCode {
    Payment_Failed("Login Failed");
    String message;

    ErrorCode(String message) {
        this.message = message;
    }
}
