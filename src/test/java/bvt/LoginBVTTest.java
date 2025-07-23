package bvt;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginBVTTest {

    @Test
    public void testLoginMessage() {
        String message = "Hello World! It's me Rakshith Raj";
        assertTrue(message.contains("Rakshith"));
    }
}

