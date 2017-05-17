import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Ping2Pong {

  @Test
  public void runPing2Pong_countUpToOne_ArrayList() {
    Ping2Pong testPing2Pong = new Ping2Pong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testPing2Pong.runPing2Pong(1));
  }

}
