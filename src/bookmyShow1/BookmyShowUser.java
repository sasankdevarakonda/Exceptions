package bookmyShow1;

public class BookmyShowUser {
    public static void main(String[] args) {
        try {
            TicketBookingProcess process = new TicketBookingProcess(89);
            process.bookingseats("Sasank", "Sasi@1234",630214251,"OG");
            System.out.println("Movie Name : "+process.getMovieName());
        } catch (PaymentException paymentException) {
            System.out.println(paymentException.getPayment()+" "+paymentException.getMessage());
        }
    }
}
