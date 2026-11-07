import java.util.Arrays;
import java.util.Scanner;

public class zC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);

        for (int i = 2; i < n; i++) {
            if (a[i - 2] + a[i - 1] > a[i]) {
                System.out.println(a[i - 2] + " " + a[i - 1] + " " + a[i]);
                return;
            }
        }
        System.out.println("No solution");
    }
}