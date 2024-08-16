package Fallo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //  Sistema para reservar entradas a concierto, en el cual hay entradas limitadas disponibles
    //  y hay muchos usuarios intentando reservar las entradas al tiempo.

    // Ralizar la ejemplificacion de distribución no sincronizada donde el número de entradas vendidas
    // llegue a ser mayor al disponible.

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10);

        Thread user1 = new BookingThread(bookingSystem,4);
        Thread user2 = new BookingThread(bookingSystem,4);
        Thread user3 = new BookingThread(bookingSystem,3);

        user1.start();
        user2.start();
        user3.start();

        try{
            user1.join();
            user2.join();
            user3.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Tickets disponibles al final:"+bookingSystem.getAvailableTickets());
    }
}