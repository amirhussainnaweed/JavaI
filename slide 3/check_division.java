package check_division;

import java.util.Scanner;

public class Check_division {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

  System.out.println("Enter the an integer: ");
        int a = input.nextInt();

        if (a%5 == a%2) {
            System.out.println("HiFive! \nHiEven!");
        }
        else if (a%5 == 0) {
            System.out.println("HiFive!");
        }
        else if (a%2 == 0) {
            System.out.println("HiEven!");
        }
    }

}
