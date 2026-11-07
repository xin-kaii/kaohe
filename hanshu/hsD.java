import java.util.Scanner;

public class hsD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (digitSum(i) % 5 == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}