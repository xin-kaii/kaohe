import java.util.Scanner;

public class mn1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] cnt = new int[10];
            int total = 0;
            for (int i = 0; i < 10; i++) {
                cnt[i] = sc.nextInt();
                total += cnt[i];
            }

            int oddCnt = 0;
            for (int i = 0; i < 10; i++) {
                if (cnt[i] % 2 != 0) oddCnt++;
            }
            if (oddCnt > 1) {
                System.out.println(-1);
                continue;
            }

            int first = -1;
            for (int i = 1; i <= 9; i++) {
                if (cnt[i] >= 2) {
                    first = i;
                    break;
                }
            }

            if (first == -1) {
                if (total == 1) {
                    for (int i = 0; i <= 9; i++) {
                        if (cnt[i] == 1) {
                            System.out.println(i);
                            break;
                        }
                    }
                } else {
                    System.out.println(-1);
                }
                continue;
            }

            StringBuilder half = new StringBuilder();
            half.append(first);
            cnt[first] -= 2;

            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j < cnt[i] / 2; j++) {
                    half.append(i);
                }
            }

            StringBuilder ans = new StringBuilder(half);
            for (int i = 0; i <= 9; i++) {
                if (cnt[i] % 2 != 0) {
                    ans.append(i);
                    break;
                }
            }
            ans.append(half.reverse());
            System.out.println(ans);
        }
    }
}