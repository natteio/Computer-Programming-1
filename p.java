// Temperature (Constructor)

package temperature;
import java.util.Scanner;
public class temperature {
    public static void main (String[] args){
    Scanner scan = new Scanner (System.in);

        Formula temp = new Formula();
        int choice;
        double degrees;

        System.out.println("Select what you want to convert:");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celsius");
        System.out.print("Convert: ");
        choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius Temperature:");
            degrees = scan.nextDouble();
            temp.Temperature(degrees);
            System.out.println(temp.celcius_to_fahrenheit());
        }
        if (choice == 2) {
            System.out.print("Enter Fahrenheit Temperature:");
            degrees = scan.nextDouble();
            temp.Temperature(degrees);
            System.out.println(temp.fahrenheit_to_celcius());
        }
    }
}

package temperature;
public class Formula {
    public double degrees;

    void Temperature(double deg){
        degrees = deg;
    }

    public double celcius_to_fahrenheit(){
        return ((degrees * 9) / 5) + 32;
    }
    public double fahrenheit_to_celcius(){
        return ((degrees - 32) * 5) / 9;
    }
}
