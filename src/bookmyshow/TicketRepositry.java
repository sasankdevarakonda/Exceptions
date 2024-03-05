package bookmyshow;

public class TicketRepositry {

        public int tickets(int seats) throws PaymentException {
                int noOfseats=5;
                TicketService service = new TicketService();
                service.tickets(seats);
                System.out.println("Totalseats: "+noOfseats);

           return seats;
    }

}
