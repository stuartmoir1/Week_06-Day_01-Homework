// Bus.java
class Bus {
  // Instance variables.
  private String id;
  private Passenger[] passengers;
  // Constructor.
  public Bus(String id){
    this.id = id;
    this.passengers = new Passenger[10];
  }
  // Getters.
  public String hasId(){
    return id;
  }
  public int passengerCount(){
    int count = 0;
    for(Passenger passenger : passengers){
      if(passenger != null) {
        count++;
      }
    }
    return count;
  }
  public void pickup(Passenger passenger){
    if (isBusFull()){
      return;
    }
    int count = passengerCount();
    passengers[count] = passenger;
  }
  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }
  // Setters.
}