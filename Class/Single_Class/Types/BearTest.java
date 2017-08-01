// BearTest.java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BearTest{
  @Test public void hasName(){
    Bear bear = new Bear("Baloo", 25, 95.62);
    assertEquals("Baloo", bear.getName());
  }
  @Test public void hasAge(){
    Bear bear = new Bear("Baloo", 25, 95.62);
    assertEquals(25, bear.getAge());
  }
  @Test public void hasWeight(){
    Bear bear = new Bear("Baloo", 25, 95.62);
    assertEquals(95.62, bear.getWeight(), 0.01);
  }
}
