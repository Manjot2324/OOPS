import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String seat, double ticketPrice) {
        seatNumber = seat;
        price = ticketPrice;
    }

    void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        ticket.movieName = scanner.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicketDetails();

        scanner.close();
    }
}
