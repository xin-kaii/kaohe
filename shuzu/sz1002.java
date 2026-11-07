import java.util.Scanner;

public class sz1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char x = sc.next().charAt(0);

        int count = 0;

        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}