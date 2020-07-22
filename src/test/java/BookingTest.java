import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Room room1;

    @Before
    public void setup() {
        room1 = new Room("A123", 2, "double", 100);
        booking = new Booking(4, room1);
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(4, booking.getNumberOfNights());
    }

    @Test
    public void hasRoom() {
        assertEquals(room1, booking.getRoom());
    }

    @Test
    public void getTotalBill() {
        assertEquals(400, booking.getTotalBill());
    }
}
