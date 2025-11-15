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

    }
}
