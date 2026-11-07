import java.util.Scanner;

public class xh1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", num);
                num++;
            }
            System.out.println();
        }
    }
}
