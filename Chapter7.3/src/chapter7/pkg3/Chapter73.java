package chapter7.pkg3;

public class Chapter73 {

    public static void main(String[] args) {

        int[] nums = new int[10];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = (int) ((Math.random() * 100) + 1);
        }

        nums[nums.length - 1] = 0;

        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {

                if (i == nums[j]) {
                    counter++;
                }
            }
            String time = (counter==1 ? "time" : "times");
            if(counter == 0) continue;
            else if(counter != 0) System.out.println(i + " occurs " + counter + " " + time);            
        }

    }

}
