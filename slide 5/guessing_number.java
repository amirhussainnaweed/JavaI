package guessing_number;
import java.util.Scanner;
public class Guessing_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random = (int)(Math.random()*101);
        int userInput = -1;

        System.out.println("we generated a number between 1 and 100, can you guess the number?");

        while (random != userInput){
            userInput = input.nextInt();

            if(random > userInput)
                System.out.println("the number you guessed was smaller than random number!");
            else if(random < userInput)
                System.out.println("the number you guessed was bigger than random number!");
        }

        System.out.println("Congratulations!");
   }
}
