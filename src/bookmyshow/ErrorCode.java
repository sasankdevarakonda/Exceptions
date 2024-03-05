package bookmyshow;

public enum ErrorCode {

    NO_TICKETS("Payment failed. Tickets Blocked.Released to Repository");
    String Message;
     ErrorCode(String Message){
         this.Message=Message;

    }
}
