package bookmyShow1;

public enum ErrorCode {
    Payment_Failed("Payment_Failed"),
    Login_Failed("Login Failed"),
    Enter_Wrong("Please Enter Valid Mobile Number"),
    Code("404 Found"),
    No_Seats_Available("Seats are not Available");
    String message;

    ErrorCode(String message) {
        this.message = message;
    }
}
