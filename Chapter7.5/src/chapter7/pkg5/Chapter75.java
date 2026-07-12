
package chapter7.pkg5;

import java.util.Scanner;

public class Chapter75 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number: ");
            nums[i] = input.nextInt();
        }

        int[] distinctArray = new int[nums.length];
        int distinctCount = 0;

        for (int i = 0; i < nums.length; i++) {

            boolean isDistinct = true;

            for (int j = 0; j < distinctCount; j++) {
                if (nums[i] == distinctArray[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinctArray[distinctCount] = nums[i];
                distinctCount++;
            }
        }

        System.out.println("The number of distinct numbers is " + distinctCount);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(distinctArray[i] + " ");
        }
        
    }
    
}
