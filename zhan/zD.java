import java.util.Scanner;

public class zD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) a[i] = sc.next();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                String x = a[j] + a[j + 1];
                String y = a[j + 1] + a[j];
                if (x.compareTo(y) < 0) {
                    String t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < n; i++) System.out.print(a[i]);
    }
}