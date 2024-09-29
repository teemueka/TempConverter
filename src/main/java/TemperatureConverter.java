
public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static float kelvinToCelsius(float kelvin) {
        return (float) (kelvin - 273.15);
    }

    public static void main(String[] args) {

        double fahrenheit = 100;
        System.out.println(fahrenheit + " fahrenheit in celsius: " + fahrenheitToCelsius(fahrenheit));

        double celsius = 100;
        System.out.println(celsius + " celsius in fahrenheit: " + celsiusToFahrenheit(celsius));

        double kelvin = 100;
        System.out.println(kelvin + " kelvin in celsius: " + kelvinToCelsius((float) kelvin));

        int temp1 = -50;
        int temp2 = 20;
        int temp3 = 60;
        System.out.println("Is " + temp1 + " extreme temperature: " + isExtremeTemperature(temp1));
        System.out.println("Is " + temp2 + " extreme temperature: " + isExtremeTemperature(temp2));
        System.out.println("Is " + temp3 + " extreme temperature: " + isExtremeTemperature(temp3));

    }
}
