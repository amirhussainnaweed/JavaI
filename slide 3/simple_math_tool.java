
package simple_math_tool;

import java.util.Scanner;

public class Simple_math_tool {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        int result = num1 + num2;

        System.out.println("What is the result of " + num1 + " + " + num2 + " = ?");
        int result_input = input.nextInt();

        if (result == result_input) {
            System.out.println("Well done!");
        }
        else {
            System.out.println("the answer is wrong! ");
        }
    }
}
