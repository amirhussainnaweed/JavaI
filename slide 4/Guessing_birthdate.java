
package guessing_birthdate;

import java.util.Scanner;

public class Guessing_birthdate {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        System.out.println("The program will guess your birthdate by giving you some sets of numbers and asking you if your birthdate is inside the set or not:");
        System.out.println("if your birth date is inside a set enter 1 and if not enter 0:");
        System.out.println("set one:\n"
                         + "1   3   5    7\n"
                         + "9   11  13  15\n"
                         + "17  19  21  23\n"
                         + "25  27  29  31");
        int set1 = input.nextInt();
        int num1 = 0;
        if (set1 == 1)
            num1 = 1;
        
        System.out.println("set two:\n"
                         + "2   3   6   7\n"
                         + "10  11  14  15\n"
                         + "18  19  22  23\n"
                         + "26  27  30  31");
        int set2 = input.nextInt();
        int num2 = 0;
        if (set2 == 1)
            num2 = 2;
        
        System.out.println("set three:\n"
                         + "4   5   6   7\n"
                         + "12  13  14  15\n"
                         + "20  21  22  23\n"
                         + "28  29  30  31");
        int set3 = input.nextInt();
        int num3 = 0;
        if (set3 == 1)
            num3 = 4;
        
        System.out.println("set four:\n"
                         + "8   9   10  11\n"
                         + "12  13  14  15\n"
                         + "24  25  26  27\n"
                         + "28  29  30  31");
        int set4 = input.nextInt();
        int num4 = 0;
        if (set4 == 1)
            num4 = 8;
        
        System.out.println("set five:\n"
                         + "16  17  18  19\n"
                         + "20  21  22  23\n"
                         + "24  25  26  27\n"
                         + "28  29  30  31");
        int set5 = input.nextInt();
        int num5 = 0;
        if (set5 == 1)
            num5 = 16;
        
        System.out.println("your birthdate is: " + (num1 + num2 + num3 + num4 + num5));
        
       
      
   
    }
    
}
 class Solution {
    
    public static int numWaterBottles(int numBottles, int numExchange) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the the total number of bottles:");
    numBottles = input.nextInt();

    System.out.println("Enter the Exchanging number:");
    numExchange = input.nextInt();

    int totalDrinks = numBottles + ((numBottles - 1) / (numExchange - 1));

    System.out.println("The total number of drinks you can get is: " + totalDrinks);
        return totalDrinks;
    }
}
