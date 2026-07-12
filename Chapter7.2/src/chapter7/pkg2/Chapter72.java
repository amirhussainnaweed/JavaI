package chapter7.pkg2;

import java.util.Scanner;

public class Chapter72 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            nums[i] = input.nextInt();
        }

        System.out.println("Before reversing:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        nums = reverse(nums);

        System.out.println("\nAfter reversing:");
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[i] = array[j];
        }

        return result;
    }

}
