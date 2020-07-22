public class Booking {

  private int numberOfNights;
  private Room room;

  public Booking(int numberOfNights, Room room) {
    this.numberOfNights = numberOfNights;
    this.room = room;
  }

  public Room getRoom() {
    return this.room;
  }

  public int getNumberOfNights() {
    return this.numberOfNights;
  }

  public int getTotalBill() {
    return this.room.getRate() * this.numberOfNights;
  }


}
