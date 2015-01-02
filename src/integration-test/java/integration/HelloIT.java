package integration;

import org.junit.*;
import static org.junit.Assert.*;

public class HelloIT {

  private String hello = "Heisan!";

  @Test
  public void helloIntegrationTest() {
    assertTrue(hello.equals(hello));
    System.out.println("================================================");
    System.out.println("Greetings From the hello Integration Test!");
    System.out.println("================================================");
  }
}

