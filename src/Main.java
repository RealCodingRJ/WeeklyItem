import itemCalculated.CalculationsKt;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Item Price: ");
        float item = scan.nextFloat();

        System.out.println("Enter Your Hourly Wage: ");
        float wage = scan.nextFloat();

        System.out.println("Enter Days You Work: ");
        float days = scan.nextFloat();

        System.out.println("Enter Hours You Work: ");
        float hours = scan.nextFloat();

        float cal = CalculationsKt.calculate(wage, days, hours);
        float itemCalculate = item / cal;

        System.out.println("You Will Have to Wait: "
                + (int)itemCalculate + " Weeks for Item That is: $" + item );

    }
}