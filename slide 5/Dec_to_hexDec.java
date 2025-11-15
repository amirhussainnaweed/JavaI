package dec_to_hexaDec;

import java.util.Scanner;

public class Dec_to_hexDec {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a decimal number to convert into hexadecimal: ");
        int num = input.nextInt();
        
        int remainder;
        char hex;
        String hexdigit = "";
        final int original = num;
        
        while(num > 0){
            remainder = num % 16;
            if (remainder < 10){
                hex = (char) ('0' + remainder);
            }
            else {
                hex = (char) ('A' + (remainder - 10));
            }
            hexdigit = hex + hexdigit;
            num = num / 16;
        }
        System.out.println("the hexadecimal value of " + original + " is " + hexdigit);
    

    }
}
