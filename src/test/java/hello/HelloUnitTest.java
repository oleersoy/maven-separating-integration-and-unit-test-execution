package hello;

import org.junit.* ;
import static org.junit.Assert.* ;

public class HelloUnitTest {

  private String hello = "Heisan!";
  private String goodbye = "Ciao!";

  @Test
  public void helloUnitTest() {
    assertTrue(hello.equals(hello));
    assertFalse(hello.equals(goodbye));
    assertTrue(hello==hello);
    assertFalse(hello==goodbye);
    System.out.println("================================================");
    System.out.println("Greetings from the hello the Unit Test!");
    System.out.println("================================================");
  }
}

