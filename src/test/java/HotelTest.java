import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

private Hotel hotel;
private Room room;
private Guest guest;

    @Before
    public void before() {
      hotel = new Hotel(10);
      room = new Room("A123", 2, "Double");
      guest = new Guest("Bob");
      hotel.addRoom(room);
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkIn(guest);
        assertEquals(1, room.guestsInRoom());
    }

}



