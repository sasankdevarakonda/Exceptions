package bookmyshow;

public class TicketController {
    public int tickets(int seats)throws PaymentException {
    TicketRepositry repositry=new TicketRepositry();
    repositry.tickets(seats);
    return 0;
    }
}
