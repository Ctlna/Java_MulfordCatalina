package Fallo;

public class TicketBookingSystem {
    private int availableTickets;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public boolean bookTicket(int quantity) {
        if (availableTickets >= quantity) {
            System.out.println("El cliente "+Thread.currentThread()+" reservó "+quantity+" entradas.");
            availableTickets-=quantity;
            return true;
        }
        else{
            System.out.println("El cliente "+Thread.currentThread()+" no pudo reservar "+quantity+" entradas.");
            return false;
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}
