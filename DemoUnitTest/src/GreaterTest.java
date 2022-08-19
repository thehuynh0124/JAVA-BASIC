import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreaterTest {
    @Test
    public void it_should_say_hello_properly(){
        Greater greater = new Greater("Huynh");
        assertEquals("HELLO Huynh", greater.hello());
        assertEquals("HELLO Binh", greater.hello("Binh"));
        assertNotEquals("HELLO Binh", greater.hello());
    }
}