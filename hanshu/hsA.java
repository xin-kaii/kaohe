import java.util.Scanner;

public class hsA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        int ans = 0;
        for (int i = L; i <= R; i++) {
            ans += countTwo(i);
        }
        System.out.println(ans);
    }

    static int countTwo(int x) {
        int cnt = 0;
        while (x > 0) {
            if (x % 10 == 2) {
                cnt++;
            }
            x /= 10;
        }
        return cnt;
    }
}
