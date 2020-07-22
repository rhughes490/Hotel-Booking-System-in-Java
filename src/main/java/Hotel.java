import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Room> rooms;
    private HashMap<String, String> typesHashMap;
    private int capacity;

    public Hotel(int capacity) {
        this.capacity = capacity;
        this.typesHashMap = new HashMap<String, String>();
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

     public void checkIn(Guest guest) {
         for (Room individualRoom : this.rooms) {
             if (individualRoom.guestsInRoom() == 0) {
                 individualRoom.addGuest(guest);
             }
         }
     }

     public void checkOut(Room room) {
          for (Room individualRoom : this.rooms) {
              if (individualRoom.equals(room)) {
                  individualRoom.removeAllGuestsFromRoom();
              }
          }
     }

}
