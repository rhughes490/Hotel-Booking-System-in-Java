import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

private Hotel hotel;
private Room room;
private Guest guest;
private Booking booking;

    @Before
    public void before() {
      hotel = new Hotel(10);
      room = new Room("A123", 2, "Double", 100);
      guest = new Guest("Bob");
//      booking = new Booking(3, room);
      hotel.addRoom(room);
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkIn(guest);
        assertEquals(1, room.guestsInRoom());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkIn(guest);
        hotel.checkIn(guest);
        hotel.checkOut(room);
        assertEquals(0, room.guestsInRoom());
    }

    @Test
    public void canMakeBooking() {
       hotel.bookRoom(3, room);
        assertEquals(1, hotel.getNumberOfBookings());
    }

}



