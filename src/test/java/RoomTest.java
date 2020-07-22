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
  public void getCapacity() {
    assertEquals(2, room.getCapacity());
  }
}
