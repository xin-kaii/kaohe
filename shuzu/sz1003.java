import java.util.Scanner;

public class sz1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        boolean[] inCircle = new boolean[n];
        for (int i = 0; i < n; i++) {
            inCircle[i] = true;
        }

        int left = n;
        int pos = k;
        int count = 0;

        while (left > 1) {
            if (inCircle[pos]) {
                count++;
                if (count == m) {
                    inCircle[pos] = false;
                    left--;
                    count = 0;
                }
            }
            pos = (pos + 1) % n;
        }

        for (int i = 0; i < n; i++) {
            if (inCircle[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}