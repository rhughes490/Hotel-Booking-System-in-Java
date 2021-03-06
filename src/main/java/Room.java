import java.util.ArrayList;

public class Room {
  private String name;
  private int capacity;
  private String type;
  private ArrayList<Guest> guests;
  private int rate;
  
  public Room(String name, int capacity, String type, int rate) {
    this.name = name;
    this.capacity = capacity;
    this.type = type;
    this.guests = new ArrayList<Guest>();
    this.rate = rate;
  }

  public int getCapacity() {
    return capacity;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getRate() {
    return rate;
  }


  public int guestsInRoom() {
    return this.guests.size();
  }

  public void removeAllGuestsFromRoom() {
    this.guests.clear();
  }

  public void addGuest(Guest guest) {
    if(capacity > guests.size())
      this.guests.add(guest);
  }

  public void removeGuest(Guest guest) {
    if(guests.size() > 0)
      this.guests.remove(guest);
  }


}
