import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Room> rooms;
    private HashMap<String, String> typesHashMap;
    private HashMap<String, DiningRoom> diningRoomsHashMap;
    private int capacity;
    private ArrayList<Booking> bookings;

    public Hotel(int capacity) {
        this.capacity = capacity;
        this.typesHashMap = new HashMap<String, String>();
        this.diningRoomsHashMap = new HashMap<String, DiningRoom>();
        this.rooms = new ArrayList<Room>();
        this.bookings = new ArrayList<Booking>();
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

    public Booking bookRoom(int numberOfNights, Room room) {
        Booking booking = new Booking (numberOfNights, room);
        this.bookings.add(booking);
        return booking;
    }

    public int getNumberOfBookings() {
        return this.bookings.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRoomsHashMap.put("BigRoom", diningRoom);
    }

//    public String getDiningRoomByName {
//        return diningRoom.name where ;
//    }

}
