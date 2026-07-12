package chapter7.pkg6;

public class Chapter76 {

    public static void main(String[] args) {

        int[] primes = new int[50];
        int count = 0;
        int number = 2;

        while (count < 50) {
            boolean isPrime = true;

            for (int i = 0; i < count; i++) {
                if (primes[i] > Math.sqrt(number)) {
                    break;
                }
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        for (int i = 0; i < primes.length; i++) {
            System.out.printf("%5d", primes[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println("");
            }
        }

    }

}
