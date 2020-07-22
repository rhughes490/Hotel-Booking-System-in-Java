import java.util.ArrayList;

public class Room {
  private String name;
  private int capacity;
  private String type;
  private ArrayList<Guest> guests;
  
  public Room(String name, int capacity, String type) {
    this.name = name;
    this.capacity = capacity;
    this.type = type;
    this.guests = new ArrayList<Guest>();
  }

  public int getCapacity() {
    return capacity;
  }

  public String name() {
    return name;
  }

  public String type() {
    return type;
  }

  public int guestsInRoom() {
    return this.guests.size();
  }



}
