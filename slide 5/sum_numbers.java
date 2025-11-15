package sum_numbers;
import java.util.Scanner;
public class Sum_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("this program will sum all the numbers you enter!");

        int userInput = 0;
        int total = 0;

        while (userInput != 1){
            total = total + userInput;
            System.out.println("enter a number you want to sum up or 1 to quit:");
            userInput = input.nextInt();
        }
        System.out.println("the total amount is " + total);
   }
}
