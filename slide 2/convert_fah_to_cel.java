
package convert_fah_to_cel;

import java.util.Scanner;

public class Convert_fah_to_cel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temprature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celicius = (5.0/9) * (fahrenheit - 32);

        System.out.println("The " + fahrenheit + " degree of fahrenheit is " + celicius + " degree of celicius." );
    }
}
