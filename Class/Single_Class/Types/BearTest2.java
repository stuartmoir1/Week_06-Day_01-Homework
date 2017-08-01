// BearTest2.java
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BearTest2{
  Bear2 bear;
  @Before public void before(){
    bear = new Bear2("Baloo", 25, 95.62);
  }
  @Test public void hasName(){
    assertEquals("Baloo", bear.getName());
  }
  @Test public void hasAge(){
    assertEquals(25, bear.getAge());
  }
  @Test public void hasWeight(){
    assertEquals(95.62, bear.getWeight(), 0.01);
  }
  @Test public void readyToHibernateIfGreaterThan80() {
    assertEquals(true, bear.readyToHibernate());
  }
  @Test public void notReadyToHibernateIfLessThan80() {
    Bear2 thinBear = new Bear2("Baloo", 25, 65.44);
    assertEquals(false, thinBear.readyToHibernate());
  }
}
