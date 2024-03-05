package bookmyshow;

public class TicketService {


    public TicketService(String password) {

    }

    public int tickets(int seats) throws PaymentException {

   String password="Sasank@007";
        try {
            int noOfseats = 5;
            if(equals(password)) {
                System.out.println("Login Successfully");
            }else{
                throw new LoginFailedException(ErrorCode.NO_TICKETS.toString());
            }
            if (seats <= noOfseats) {
                noOfseats=noOfseats-seats;
                System.out.println("Booking seats: "+seats);
                System.out.println("AvailableSeats: " + noOfseats);
            }
        }catch (Exception e){
            throw new PaymentException(ErrorCode.NO_TICKETS.toString(), "Payment failed. Tickets Blocked.Released to Repository");
        }
         /*  finally {


                       boolean SeatAccess=false;
                         if (!SeatAccess) {
                             throw new PaymentException(ErrorCode.NO_TICKETS.toString(), "Payment failed. Tickets Blocked.Released to Repository");
                         }
        }*/
        return seats;
    }
}