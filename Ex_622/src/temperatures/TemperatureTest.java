package temperatures;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    @org.junit.jupiter.api.Test
    void testToCelsius(){
        assertEquals( 0, Temperature.toCelsius( 32 ) );
    }

    @org.junit.jupiter.api.Test
    void testToFahrenheit(){
        assertEquals( 32, Temperature.toFahrenheit( 0 ) );
    }
}
