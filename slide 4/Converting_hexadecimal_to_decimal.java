
package converting_hexadecimal_to_decimal;

import java.util.Scanner;

public class Converting_hexadecimal_to_decimal {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a digit in hexa decimal to convert to decimal:");
        String digit = input.next();
        char isdigit = digit.charAt(0);
        int a;
        
        if (isdigit >= '0' && isdigit <= '9'){
            a = isdigit - '0';
            System.out.println("the decimal value is: " + a);
        }
        else if (isdigit >= 'A' && isdigit <= 'F'){
            a = (isdigit - 'A') + 10;
            System.out.println("the decimal value is: " + a);
        }
        else {
            System.out.println("An invalid number was entered!");
        }
        
    }
    
}
