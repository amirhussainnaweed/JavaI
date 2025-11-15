
package improved_math_tool;

import java.util.Scanner;

public class Improved_math_tool {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);


        if(a > b){
            System.out.println("what is the result of " + a + " - " + b + "?");
            int user = input.nextInt();
            int result = a - b;
            if(user == result)
                System.out.println("correct");
            else
                System.out.println("wrong");
        }
        if(b > a){
            System.out.println("what is the result of " + b + " - " + a + "?");
            int user = input.nextInt();
            int result = b - a;
            if(user == result)
                System.out.println("correct");
            else
                System.out.println("wrong");
        }
    }
}
