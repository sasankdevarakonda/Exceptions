package bookmyshow;

public class TicketBookingClient {
    public static void main(String[] args) {

        try {
            TicketController controller = new TicketController();

            controller.tickets(4);


        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        }

    }
}
