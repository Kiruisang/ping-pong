package models;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingpongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        Pingpong testPingPong = new Pingpong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }
}
