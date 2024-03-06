package bookmyShow1;

public class TicketBookingProcess extends TicketBooking {

    int reminingSeats;
    int totalPrize;



    String movieName;
    public TicketBookingProcess(int noOfSeats) {
        super(noOfSeats);
    }


    public int bookingseats(String username, String pasword ,int mobile,String movieName) throws PaymentException {
        this.movieName = movieName;
        String userName = "Sasank";
        String password = "Sasi@1234";
        int ticketCost = 200;
        int mobileNumber = 630214251;
        int TotalAvailableSeats = 150;
        if (username.equals(userName) && pasword.equals(password)) {
            System.out.println("BookMyShow Login SuccessFull");
            if (noOfSeats <= TotalAvailableSeats) {
                reminingSeats = TotalAvailableSeats - noOfSeats;
                System.out.println("Each Ticket Prize : " + ticketCost);

            } else {
                System.out.println("Seats In Hold : " + noOfSeats);
                System.out.println("AvailableSeats : " + TotalAvailableSeats);
                throw new PaymentException(ErrorCode.No_Seats_Available.message, ErrorCode.Code.message);
            }
            if (mobileNumber == mobile) {
                totalPrize = noOfSeats * 200;
                System.out.println("Total Prize : " + totalPrize);
                System.out.println("Payment SuccessFull");
                System.out.println("Booking seats : " + noOfSeats);
                System.out.println("AvailableSeats : " + reminingSeats);

            } else {
                System.out.println("Seats In Hold : " + noOfSeats);
                System.out.println("AvailableSeats : " + TotalAvailableSeats);
                throw new PaymentException(ErrorCode.Enter_Wrong.message, ErrorCode.Code.message);
            }

        } else {
            System.out.println("Seats In Hold : " + noOfSeats);
            System.out.println("AvailableSeats : " + TotalAvailableSeats);
            throw new PaymentException(ErrorCode.Login_Failed.message,ErrorCode.Code.message);
        }
        return reminingSeats;
    }
        public String getMovieName () {
            return movieName;
        }

}
