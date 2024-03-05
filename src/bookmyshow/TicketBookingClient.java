package bookmyshow;

public class TicketBookingClient {
    public static void main(String[] args) {

        try {
            TicketController controller = new TicketController();
            controller.tickets(3);
           // TicketRepositry repositry = new TicketRepositry();
           // repositry.tickets(6);

           // TicketService service=new TicketService();
           // service.tickets(6);
           // service.bookTickets(5);
          //  TicketRepositry repositry=new TicketRepositry();
           // repositry.tickets(15);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        }
    }
}
