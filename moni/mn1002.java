import java.util.Scanner;

public class mn1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next();
            boolean[] used = new boolean[10];
            boolean ok = true;

            for (int i = 0; i < s.length(); i++) {
                int cur = s.charAt(i) - '0';

                if (used[cur]) {
                    ok = false;
                    break;
                }
                used[cur] = true;

                if (i > 0) {
                    int pre = s.charAt(i - 1) - '0';
                    int mid = 0;

                    if ((pre == 1 && cur == 3) || (pre == 3 && cur == 1)) mid = 2;
                    if ((pre == 4 && cur == 6) || (pre == 6 && cur == 4)) mid = 5;
                    if ((pre == 7 && cur == 9) || (pre == 9 && cur == 7)) mid = 8;

                    if ((pre == 1 && cur == 7) || (pre == 7 && cur == 1)) mid = 4;
                    if ((pre == 2 && cur == 8) || (pre == 8 && cur == 2)) mid = 5;
                    if ((pre == 3 && cur == 9) || (pre == 9 && cur == 3)) mid = 6;

                    if ((pre == 1 && cur == 9) || (pre == 9 && cur == 1)) mid = 5;
                    if ((pre == 3 && cur == 7) || (pre == 7 && cur == 3)) mid = 5;

                    if (mid != 0 && !used[mid]) {
                        ok = false;
                        break;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}