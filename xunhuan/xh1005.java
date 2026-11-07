import java.util.Scanner;

public class xh1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            // 上半部分
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n + 1 - i) * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // 中间一整行
            for (int i = 1; i <= n + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            // 下半部分
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n + 1 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}


