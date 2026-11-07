import java.util.Scanner;

public class hsB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int days = 31;
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                days = 30;
            } else if (m == 2) {
                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
            }

            int ans = 0;

            if (y / 1000 == x) ans += days;
            if (y / 100 % 10 == x) ans += days;
            if (y / 10 % 10 == x) ans += days;
            if (y % 10 == x) ans += days;

            if (m / 10 == x) ans += days;
            if (m % 10 == x) ans += days;

            for (int d = 1; d <= days; d++) {
                if (d / 10 == x) ans++;
                if (d % 10 == x) ans++;
            }

            System.out.println(ans);
        }
    }
}