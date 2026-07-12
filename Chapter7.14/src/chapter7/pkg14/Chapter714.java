package chapter7.pkg14;

import java.util.Scanner;

public class Chapter714 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 numbers with one space in between of them:");
        for (int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("The gcd of these numbers are " + gcd(nums));

    }

    public static int gcdTwo(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }

    public static int gcd(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcdTwo(result, numbers[i]);
        }

        return result;
    }

}
