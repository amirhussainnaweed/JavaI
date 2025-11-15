package convert_seconds_to_minutes;
import java.util.Scanner;

public class convert_seconds_to_minutes {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of seconds to convert into minutes and seconds:");
        int total_second = input.nextInt();
        
        int minutes = total_second / 60;
        int second = total_second % 60;
        
        System.out.println("the amount of " + total_second + " seconds is equal to " + minutes + " minutes and " + second + " second.");
    }
    
}
