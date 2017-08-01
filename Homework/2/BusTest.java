// BusTest.java
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before public void before(){
    bus = new Bus("X77");
    person = new Person();
    // busStop = new Person();
  }

  // Initial state.
  @Test public void hasId(){
    assertEquals("X77", bus.hasId());
  }
  @Test public void busStartsEmpty(){
    assertEquals(0, bus.personCount());
  }

  // Person pick up.
  @Test public void canPickupPerson(){
    bus.pickup(person);
    assertEquals(1, bus.personCount());
  }
  @Test public void canPickup2Persons(){
    bus.pickup(person);
    bus.pickup(person);
    assertEquals(2, bus.personCount());
  }
  @Test public void cannotPickupMorePersonsWhenFull(){
    for(int i = 0; i<12; i++){
      bus.pickup(person);
    }
    assertEquals(10, bus.personCount());
  }

  // Person dropoff
  @Test public void canDropoffPerson(){
    bus.pickup(person);
    bus.pickup(person);
    bus.dropoff(person);
    assertEquals(1, bus.personCount());
  }
  @Test public void cannotDropoffMorePersonsWhenEmpty(){
    bus.pickup(person);
    bus.pickup(person);
    bus.dropoff(person);
    bus.dropoff(person);
    bus.dropoff(person);
    assertEquals(0, bus.personCount());
  }
}

