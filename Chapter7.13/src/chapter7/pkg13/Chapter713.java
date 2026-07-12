package chapter7.pkg13;

public class Chapter713 {

    public static void main(String[] args) {

        for (int i = 1; i <= 45; i++) {
            int random = getRandom(1, 100, 4, 8, 95, 93);
            System.out.printf("%4d", random);
            if (i % 15 == 0) {
                System.out.println();
            }
        }

    }

    public static int getRandom(int start, int end, int... numbers) {
        int[] array = new int[end - start + 1 - (numbers.length)];

        for (int i = 0, j = start; i < array.length; i++, j++) {
            boolean isThere = false;
            for (int x = 0; x < numbers.length; x++) {
                if (j == numbers[x]) {
                    isThere = true;
                    i--;
                }

            }
            if (!isThere) {
                array[i] = j;
            }

        }

        int random = (int) (Math.random() * array.length);

        return array[random];
    }

}
