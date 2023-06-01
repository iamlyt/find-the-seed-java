import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Random rnd = new Random();

        int min = Integer.MAX_VALUE;
        int seed = 0;

        // set seed in each iteration
        for (int i = a; i <= b; i++) {
            int max = 0;
            rnd.setSeed(i);

            // generate 4 numbers for each seed
            for (int j = 0; j < n; j++) {
                int num = rnd.nextInt(k);
                // find maximum
                if (num > max) {
                    max = num;
                }
            }
            // find mininmum
            if (max < min) {
                min = max;
                seed = i;
            }
        }
        System.out.println(seed + "\n" + min);
    }
}