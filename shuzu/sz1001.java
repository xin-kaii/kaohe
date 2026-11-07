import java.util.Scanner;

public class sz1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long max = a[0];
            long min = a[0];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
                sum += a[i];
            }

            long range = max - min;
            double average = (double) sum / n;
            double variance = 0.0;

            for (int i = 0; i < n; i++) {
                double diff = a[i] - average;
                variance = variance + diff * diff;
            }
            variance = variance / n;

            System.out.printf("%d %.3f\n", range, variance);
        }
    }
}