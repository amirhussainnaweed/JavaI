
package compute_loan_amount;

import java.util.Scanner;

public class Compute_loan_amount {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
        
        // Computing monthly loan amount:
        System.out.println("Enter the loan amount: ");
        double loan = input.nextDouble();
        
        System.out.println("Enter the interest rate of the bank you took loan from: ");
        double rate = input.nextDouble()/100;
        
        System.out.println("Enter the time you should pay the loan back in years: ");
        double time = input.nextDouble();
        
        double up = loan * rate;
        double down = 1 - (1 / Math.pow(1 + rate, time * 12));
        
        double payment = up/down;
        
        System.out.println("The amount you should payback each month is: " + payment);
        
        
        
        
        
        // Converting dollos into quarters, dimes, nickels and cents:
        System.out.println("Enter the amount of money you got to convert it into dollors, quarters, dimes, and pennies: ");
        double the_money = input.nextDouble();
        
        double dollors = the_money;
        
        double quarters = the_money/0.25;
        
        double dimes = the_money/0.10;
        
        double cents = the_money/0.01;
        
        System.out.println("The money entered is equavalent to " + dollors + " dollors. " + quarters + " quarters. " + dimes + " dimes. " + cents + "cents.");
        
        
        
        
        
        
        // Checking if a number is divideable on 5 and 2:
        System.out.println("Enter the an integer: ");
        int a = input.nextInt();
        
        if (a%5 == a%2) {
            System.out.println("HiFive! \nHiEven!");}
        else if (a%5 == 0) {
            System.out.println("HiFive!");}
        else if (a%2 == 0) {
            System.out.println("HiEven!");}
        
     
        
        
        
    }
    
}