
package lottory_check;

import java.util.Scanner;

public class Lottory_check {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        int comp_num = (int)(Math.random() * 100);
        System.out.println("Enter a two digit number: ");
        int user_num = input.nextInt();
        
        int a = comp_num / 10;
        int b = comp_num % 10;
        
        int c = user_num / 10;
        int d = user_num % 10;
        
        if ((c == a) && (b == d))
            System.out.println("That was correct and you won 10000 US Dollors! ");
        else if ((c == b) && (d == a))
            System.out.println("The order wasn't correct but the digits were correct so you won 3000 US Dollors! ");
        else if ((c == a) || (d == b))
            System.out.println("Only one digit was correct so you won 1000 US Dollors! ");
        else if ((c == b) || (d == a))
            System.out.println("Only one digit was correct so you won 1000 US Dollors!");
        else 
            System.out.println("Unfortunately the number you entered didn't match the auto generated number.");
        
        
        
    }
    
}
