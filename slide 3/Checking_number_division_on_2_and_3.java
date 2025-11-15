
package checking_number_division_on_2_and_3;

import java.util.Scanner;

public class Checking_number_division_on_2_and_3 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
        System.out.println("Enter a number to check if it is divisible on 2 and 3: ");
        int num = input.nextInt();
        
        if ((num % 2 == 0) && (num % 3 == 0))
            System.out.println("The number is divisable on both of them!");
        
        else if (num % 2 == 0 ^ num % 3 == 0) {
            if (num % 2 == 0)
                System.out.println("The number is divisable on 2.");
            else if (num % 3 == 0)
                System.out.println("The number is divisable on 3.");
        }
        
    }
    
}
