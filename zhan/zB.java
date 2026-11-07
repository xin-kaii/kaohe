import java.util.Arrays;
import java.util.Scanner;

public class zB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        for (int i = 0; i < n; i++) b[i] = sc.nextLong();

        long sum = 0;
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            sum += b[i];
            c[i] = a[i] - b[i];
        }

        Arrays.sort(c);
        for (int i = n - 1; i >= n - k; i--) {
            sum += c[i];
        }
        System.out.println(sum);
    }
}