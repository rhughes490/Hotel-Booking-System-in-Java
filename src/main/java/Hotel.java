import java.util.HashMap;

public class Hotel {

   private HashMap<String, String> typesHashMap;
   private int capacity;

  public Hotel(int capacity) {
    this.capacity = capacity;
    this.typesHashMap = new HashMap<String, String>();
  }

}

