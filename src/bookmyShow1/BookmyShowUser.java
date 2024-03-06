package bookmyShow1;

public class BookmyShowUser {
    public static void main(String[] args) {
        try {
            TicketBookingProcess process = new TicketBookingProcess(7);
            process.bookingseats("Sasank", "Sasi@12345");
        } catch (PaymentException paymentException) {
            System.out.println(paymentException.getPayment()+" "+paymentException.getMessage());
        }
    }
}
