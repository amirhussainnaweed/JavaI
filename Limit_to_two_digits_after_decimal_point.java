package javahomework;

import java.util.Scanner;

public class Javahomework {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("Enter the tax percentage: ");
        double tax = input.nextDouble();

        double tax_amount = price * (tax / 100);

        System.out.println(String.format("%.2f", tax_amount) + " is the tax amount");
    }
 }
