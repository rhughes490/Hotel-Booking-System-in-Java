import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

  private Room room;
  private Guest guest;
  private Guest guest2;
  private Guest guest3;

  @Before
  public void before() {
    room = new Room("A123", 2, "Double");
    guest = new Guest("Bob");
    guest2 = new Guest("Bobby");
    guest3 = new Guest("Robert");
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

  @Test
  public void canAddPerson() {
    room.addGuest(guest);
    room.addGuest(guest2);
    assertEquals(2, room.guestsInRoom());
  }

  @Test
  public void cannotAddPerson() {
    room.addGuest(guest);
    room.addGuest(guest2);
    room.addGuest(guest3);
    assertEquals(2, room.guestsInRoom());
  }


  @Test
  public void canRemovePerson() {
    room.addGuest(guest);
    room.addGuest(guest2);
    room.removeGuest(guest2);
    assertEquals(1, room.guestsInRoom());
  }

  @Test
  public void cannotRemovePerson() {
    room.addGuest(guest);
    room.removeGuest(guest2);
    room.removeGuest(guest);
    assertEquals(0, room.guestsInRoom());
  }


}
