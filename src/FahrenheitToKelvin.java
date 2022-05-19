import java.util.Scanner;

public class FahrenheitToKelvin {

    // TODO:
    // * 3 bugs:
    // * %d -> %f
    // * fahrenheit + 459.67 -> (fahrenheit + 459.67) - missing parenthese
    // * 5 / 9 -> 5.0 / 9.0

    public static void main(String[] args) {
        // declare data
        double kelvin;
        double fahrenheit;
        // input temperature
        Scanner in = new Scanner(System.in);
        fahrenheit = in.nextDouble();
        // calculate fahrenheit equivalent
//        kelvin = 5 / 9 * fahrenheit + 459.67;
        kelvin = (5.0 / 9.0) * (fahrenheit + 459.67);
        // output results
//        System.out.printf("fahrenheit = %d and kelvin = %d\n", fahrenheit, kelvin);
        System.out.printf("fahrenheit = %f and kelvin = %f\n", fahrenheit, kelvin);
    }
}