package temperatures;

public class Temperature {
    public static double toCelsius( double fahrenheit ) {
        return 5.0 / 9.0 * ( fahrenheit - 32 );
    }

    public static double toFahrenheit( double celsius ) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
