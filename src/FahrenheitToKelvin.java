import java.util.Scanner;

public class FahrenheitToKelvin
{
    public static void main( String [] args ) {
        // declare data
        double kelvin;
        double fahrenheit;
        // input temperature
        Scanner in = new Scanner( System.in );
        fahrenheit = in.nextDouble( );
        // calculate fahrenheit equivalent
        kelvin = 5 / 9 * fahrenheit + 459.67;
        // output results
        System.out.printf( "fahrenheit = %d and kelvin = %d\n", fahrenheit, kelvin);
    }
}