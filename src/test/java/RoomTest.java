import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

  private Room room;
  private Guest guest;

  @Before
  public void before() {
    room = new Room("A123", 2, "Double");
    guest = new Guest("Bob");
  }

  @Test
  public void canGetCapacity() {
    assertEquals(2, room.getCapacity());
  }

  @Test
  public void canGetName() {
    assertEquals("A123", room.getName());
  }

  @Test
  public void canGetType() {
    assertEquals("Double", room.getType());
  }

  @Test
  public void canCountGuestsInRoom() {
    room.addGuest(guest);
    assertEquals(1, room.guestsInRoom());
  }
}
