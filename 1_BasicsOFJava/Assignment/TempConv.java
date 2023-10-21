package Assignment;
import java.util.Scanner;

public class TempConv {
  static double temperature;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the temperature: ");

    temperature = scanner.nextDouble();

    System.out.println("\n----- Conversion Menu -----");

    System.out.println("1. Celsius to Fahrenheit");

    System.out.println("2. Fahrenheit to Celsius");

    System.out.println("---------------------------");

    System.out.print("Enter your choice: ");

    int choice = scanner.nextInt();

    double convertedTemperature;

    switch (choice) {
      case 1:
        celsiusToFahrenheit(temperature);
        break;

      case 2:
        fahrenheitToCelsius(temperature);

        break;

      default:

        System.out.println("Invalid choice!");

        break;
    }

    // scanner.close();

  }

  public static double celsiusToFahrenheit(double celsius) {
    System.out.println("Celsius to Fahrenheit");
    double Fahr = (temperature * 9 / 5) + 32;
    System.out.println(Fahr);
    return Fahr;

  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    System.out.println("Fahrenheit to Celsius");
    double cel = (temperature - 32) * 5 / 9;
    System.out.println(cel);
    return cel;

  }

}
