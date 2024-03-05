package bookmyShow1;

public class TicketBookingProcess extends TicketBooking {

    int ReminingSeats;
    public TicketBookingProcess(int noOfSeats) {
        super(noOfSeats);
    }


    public int bookingseats(String username, String pasword) throws PaymentException {
        String userName = "Sasank";
        String password = "Sasi@1234";
        int TotalAvailableSeats = 10;
        if (username.equals(userName) && pasword.equals(password)) {
            System.out.println("Login SuccessFully");
            if (noOfSeats <= TotalAvailableSeats) {
                ReminingSeats = TotalAvailableSeats - noOfSeats;
                System.out.println("Booking seats: " + noOfSeats);
                System.out.println("AvailableSeats: " + ReminingSeats);
            }
        } else {
            System.out.println("AvailableSeats : "+TotalAvailableSeats);
            throw new PaymentException(ErrorCode.Payment_Failed.toString(),"Login failed");
        } return ReminingSeats;
    }
 }
