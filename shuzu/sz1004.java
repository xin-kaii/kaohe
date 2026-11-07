import java.util.Scanner;

public class sz1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int M = sc.nextInt();

        boolean[] removed = new boolean[L + 1];

        for (int i = 0; i < M; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int j = l; j <= r; j++) {
                removed[j] = true;
            }
        }

        int ans = 0;
        for (int i = 0; i <= L; i++) {
            if (!removed[i]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}