// BusStop.java
class BusStop{

  // Instance variables.
  private String name;
  private Person[] persons;

  // Constructor.
  public BusStop(String name){
    this.name = name;
    this.persons = new Person[100];
  }

  // Getters.

  public String hasName(){
    return name;
  }

  public int personCount(){
    int count = 0;
    for(Person person : persons){
      if(person != null) {
        count++;
      }
    }
    return count;
  }

  public void queue(Person person){
    int count = personCount();
    persons[count] = person;
  }

  public void emptyQueue(Person person){
    int count = personCount();
    for(int i = 0; i < count; i++){
      persons[i] = null;
    }
  }

  public boolean isQueueEmpty(){
    return personCount() == 0;
  }
}















































// // BusStop.java
// class BusStop{

//   // Instance variables.
//   private Person[] busPersons;
//   private Person[] busStopPersons;

//   // Constructor.
//   public BusStop(){
//     this.busPersons = new Person[10];
//     this.busStopPersons = new Person[100];
//   }

//   public void getOnBus(){
    
//   }
// }