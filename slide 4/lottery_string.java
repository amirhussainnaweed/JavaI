import java.util.Scanner;

public class Lottery_string {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 100);
	String lotteryStr = String.format("%02d", lottery);

        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.next();

        char l1 = lotteryStr.charAt(0);
        char l2 = lotteryStr.charAt(1);

        char g1 = guess.charAt(0);
        char g2 = guess.charAt(1);

        if (guess.equals(lotteryStr)) {
            System.out.println("Exact match! You win $10,000!");
        }
        else if (g1 == l2 && g2 == l1) {
            System.out.println("Match all digits! You win $3,000!");
        }
        else if (g1 == l1 || g1 == l2 || g2 == l1 || g2 == l2) {
            System.out.println("Matched one digit! You win $1,000!");
        }
        else {
            System.out.println("Sorry, no match.");
        }
    }
}
