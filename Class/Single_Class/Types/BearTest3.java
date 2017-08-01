// BearTest3.java
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BearTest3{
  Bear3 bear;
  @Before public void before(){
    bear = new Bear3("Baloo", 25, 95.62, 2.1);
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
    Bear3 thinBear = new Bear3("Baloo", 25, 65.42, 1.9);
    assertEquals(false, thinBear.readyToHibernate());
  }
}
