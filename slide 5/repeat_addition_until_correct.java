package repeat_addition_until_correct;
import java.util.Scanner;
public class Repeat_addition_until_correct {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);

        int answer = num1 + num2;
        int userAnswer = -1;

        while(answer != userAnswer){
            System.out.println("What is " + num1 + " + " + num2 + " = ?");
            userAnswer = input.nextInt();
        }

        System.out.println("CONGRATS!");
   }
}
