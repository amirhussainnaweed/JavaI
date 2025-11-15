package advanced_math_learning_tool;
import java.util.Scanner;
public class Advanced_math_learning_tool {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("this is a program that gives you five subtraction question and reports the number of correct answers:");
        int count = 0;
        int userinput;
        int compInput;

        for(int i = 0; i < 5; i++){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);

            if(num1 > num2){
                System.out.println("what is " + num1 + " - " + num2 + " = ?");
                userinput = input.nextInt();
                compInput = num1 - num2;
                if(userinput == compInput)
                    count++;
            }
            else if(num2 > num1){
                System.out.println("what is " + num2 + " - " + num1 + " = ?");
                userinput = input.nextInt();
                compInput = num2 - num1;
                if(userinput == compInput)
                    count++;
            }
        }
        System.out.println("the number of correct answers are: " + count);
    }
}
