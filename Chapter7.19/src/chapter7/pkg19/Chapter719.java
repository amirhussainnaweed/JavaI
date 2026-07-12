package chapter7.pkg19;

import java.util.Scanner;

public class Chapter719 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            nums[i] = input.nextInt();
        }

        boolean result = isSorted(nums);

        if (result) {
            System.out.println("The array is sorted!");
        } else {
            System.out.println("The array is NOT sorted!");
        }

    }

    public static boolean isSorted(int[] array) {
        boolean isSorted_ = true;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    isSorted_ = false;
                }
            }
        }

        return isSorted_;
    }

}
