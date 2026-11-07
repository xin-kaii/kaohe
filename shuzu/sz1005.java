import java.util.Scanner;

public class sz1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int last = a[n - 1];

        if (n == 1) {
            if (last == 0) {
                System.out.println("UP");
            } else if (last == 15) {
                System.out.println("DOWN");
            } else {
                System.out.println("-1");
            }
        } else {
            if (last == 15) {
                System.out.println("DOWN");
            } else if (last == 0) {
                System.out.println("UP");
            } else if (last > a[n - 2]) {
                System.out.println("UP");
            } else {
                System.out.println("DOWN");
            }
        }
    }
}