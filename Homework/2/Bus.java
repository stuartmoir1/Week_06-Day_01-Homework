// Bus.java
class Bus {

  // Instance variables.
  private String id;
  private Person[] persons;
  
  // Constructor.
  public Bus(String id){
    this.id = id;
    this.persons = new Person[10];
  }
  
  // Getters.

  public String hasId(){
    return id;
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
  
  public void pickup(Person person){
    if (isBusFull()){
      return;
    }
    int count = personCount();
    persons[count] = person;
  }
  
  public boolean isBusFull(){
    return personCount() == persons.length;
  }

  public void dropoff(Person person){
    if (isBusEmpty()){
      return;
    }
    int count = personCount();
    persons[count - 1] = null;
  }

  public boolean isBusEmpty(){
    return personCount() == 0;
  }
}