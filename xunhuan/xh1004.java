import java.util.Scanner;

public class xh1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int mid = n / 2 + 1;

            // 上半部分
            for (int i = 1; i <= mid; i++) {
                for (int j = 1; j <= mid - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 下半部分
            for (int i = 1; i <= mid - 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * (mid - i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
