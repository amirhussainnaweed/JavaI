package chapter7.pkg11;

import java.util.Scanner;

public class Chapter711 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] nums = new double[10];

        System.out.println("Enter ten double values to find the mean and the deviation:");

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the number:" + (i + 1));
            nums[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f%n", mean(nums));
        System.out.printf("The standard deviation is %.5f%n", deviation(nums, mean(nums)));

    }

    public static double deviation(double[] array, double mean) {
        double numerator = 0;
        for (double i : array) {
            numerator += Math.pow((i - mean), 2);
        }
        double deviation = Math.sqrt(numerator / (array.length - 1));

        return deviation;
    }

    public static double mean(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        double mean = sum / array.length;

        return mean;
    }

}
