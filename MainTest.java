import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest{
  @Test
public void testNothing() {}

@Test
public void testSomeStuff(){
  
String test1 = "Test1 failed";
assertEquals(test1, 5, 2+3, 0);

String test2 = "null"; //String is not null
String m2 = "Test2 failed";
assertNotNull(m2, test2);

String test3 = "Test3 failed";
boolean  X = (3 * 7)>(4 * 5);
assertTrue(test3, X);
}
}