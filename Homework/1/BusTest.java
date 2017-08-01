// BearTest3.java
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Passenger passenger;

  @Before public void before(){
    bus = new Bus("X77");
    passenger = new Passenger();
  }

  @Test public void hasId(){
    assertEquals("X77", bus.hasId());
  }
  @Test public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }
  @Test public void canAddPassenger(){
    bus.pickup(passenger);
    assertEquals(1, bus.passengerCount());
  }
  @Test public void canAdd2Passengers(){
    bus.pickup(passenger);
    bus.pickup(passenger);
    assertEquals(2, bus.passengerCount());
  }
  @Test public void cannotAddMorePassengersWhenFull(){
    for(int i = 0; i<12; i++){
      bus.pickup(passenger);
    }
    assertEquals(10, bus.passengerCount());
  }
}