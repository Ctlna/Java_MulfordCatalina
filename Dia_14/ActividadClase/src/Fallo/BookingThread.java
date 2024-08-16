package Fallo;

public class BookingThread extends Thread{
    private TicketBookingSystem bookingSystem;
    private int quantity;

    public BookingThread(TicketBookingSystem bookingSystem, int quantity) {
        this.bookingSystem = bookingSystem;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(quantity);
    }
}
