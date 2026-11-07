import java.util.Scanner;

public class xh1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = c - 'A' + 1; // 金字塔层数
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            int k = 0;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) ('A' + k));
                if (j < i) k++;
                else k--;
            }
            System.out.println();
        }
    }
}
