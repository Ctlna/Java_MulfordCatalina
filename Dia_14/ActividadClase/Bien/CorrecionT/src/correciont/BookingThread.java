/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correciont;

/**
 *
 * @author Usuario
 */
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