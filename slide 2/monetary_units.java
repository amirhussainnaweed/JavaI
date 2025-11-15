package monetary_units;

import java.util.Scanner;

public class Monetary_units {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 System.out.println("Enter the amount of money you got to convert it into dollors, quarters, dimes, and pennies: ");
        double the_money = input.nextDouble();

        double dollors = the_money;

        double quarters = the_money/0.25;

        double dimes = the_money/0.10

        double cents = the_money/0.01;

        System.out.println("The money entered is equavalent to " + dollors + " dollors. " + quarters + " quarters. " + dimes + " dimes. " + cents + "cents.");
   }
}
