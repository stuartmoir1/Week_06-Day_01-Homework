// BearStopTest.java
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  Bus bus;
  Person person;
  BusStop busStop;

  @Before public void before(){
    bus = new Bus("X77");
    person = new Person();
    busStop = new BusStop("Bothwell Street");
  }

  // Initial state.
  @Test public void hasName(){
    assertEquals("Bothwell Street", busStop.hasName());
  }
  @Test public void busStopStartsEmpty(){
    assertEquals(0, busStop.personCount());
  }

  // Queue
  @Test public void canMakeQueue(){
    busStop.queue(person);
    busStop.queue(person);
    busStop.queue(person);
    assertEquals(3, busStop.personCount());
  }
  @Test public void canEmptyMakeQueue(){
    busStop.queue(person);
    busStop.queue(person);
    busStop.queue(person);
    busStop.emptyQueue(person);
    assertEquals(0, busStop.personCount());
  }

  // Queue gets bus.
  @Test public void queueGetsBus(){
    busStop.queue(person);
    busStop.queue(person);
    busStop.queue(person);
    bus.pickup(person);
    bus.pickup(person);
    bus.pickup(person);
    busStop.emptyQueue(person);
    assertEquals(0, busStop.personCount());
    assertEquals(3, bus.personCount());
  }
}


