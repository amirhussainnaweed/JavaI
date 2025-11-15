package twodigits_after_decimal;

import java.util.Scanner;

public class Twodigits_after_decimal {

     public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter the price of the good:");
        double price = input.nextDouble();
        System.out.println("enter the tax rate:");
        double taxrate = input.nextDouble();

        double tax = price * (taxrate / 100);

        System.out.printf("the tax is %.2f%n", tax);
   }
}
