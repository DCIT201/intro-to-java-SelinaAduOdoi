import java.util.Scanner;

public class TemperatureConverter {
    //prompt user to choose between options
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option");
        System.out.println("1. Convert Celsius to Farenheit");
        System.out.println("2. Convert Farenheit to Celsuis");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsuis : ");
                double celsuis = scanner.nextDouble();
                double farenheit = (celsuis * 1.8) + 32;
                System.out.println("Temperature in Farenheit: " + farenheit);
                break;
            case 2:
                System.out.println("Enter temperature in Farenheit: ");
                farenheit = scanner.nextDouble();
                double celsius = (farenheit - 32) * 1.8;
                System.out.println("Temperature in Celsius: " + farenheit);
                break;
            default:
                System.out.println("Invalid option");
                break;


        }
        scanner.close();


    }
}
