package chapter7.pkg18;

import java.util.Scanner;

public class Chapter718 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            int temp = 0;
            int randomindex = (int) (Math.random() * 100);
            temp = numbers[i];
            numbers[i] = numbers[randomindex];
            numbers[randomindex] = temp;
        }

        numbers = bubbleSort(numbers);

    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}
