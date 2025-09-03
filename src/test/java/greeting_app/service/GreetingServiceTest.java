package greeting_app.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {
    @Test
    void greetShouldReturnCorrectMessage() {
        GreetingService service = new GreetingService();
        assertEquals("Hello, Bob!", service.greet("Bob"));
    }
}
