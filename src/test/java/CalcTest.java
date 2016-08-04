import org.junit.Test;

import static org.junit.Assert.assertEquals;

 

public class CalcTest {

 @Test
 public void testAdd() {
  assertEquals(5, new Calc().add(2, 3));

 }

}
