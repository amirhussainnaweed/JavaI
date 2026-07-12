package chapter7.pkg12;

import java.util.Scanner;

public class Chapter712 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number " + (i + 1));
            numbers[i] = input.nextInt();
        }

        numbers = reverse(numbers);
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }

    public static int[] reverse(int[] array) {
        int[] copyArray = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            copyArray[j] = array[i];
        }

        return copyArray;
    }

}
