package chapter7.pkg15;

import java.util.Scanner;
import java.util.Arrays;

public class Chapter715 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter 10 numbers with one space between each:");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        array = duplicate(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static int[] duplicate(int[] array) {
        int[] temp = new int[array.length];
        int size = 0;

        for (int i = 0; i < array.length; i++) {
            boolean dup = false;
            for (int j = 0; j < size; j++) {
                if (array[i] == temp[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                temp[size] = array[i];
                size++;
            }
        }

        return Arrays.copyOf(temp, size);
    }

}
