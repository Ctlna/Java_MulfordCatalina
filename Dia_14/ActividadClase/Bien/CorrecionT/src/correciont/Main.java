/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correciont;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
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