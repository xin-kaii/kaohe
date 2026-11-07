import java.util.Scanner;

public class mn1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] words = {"zero", "two", "four", "six", "nine"};
        char[] digits = {'0', '2', '4', '6', '9'};

        for (int k = 0; k < T; k++) {
            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            int i = 0;

            while (i < s.length()) {
                boolean matched = false;
                for (int j = 0; j < 5; j++) {
                    if (s.charAt(i) == digits[j]) {
                        ans.append(digits[j]);
                        i++;
                        matched = true;
                        break;
                    }
                    if (s.startsWith(words[j], i)) {
                        ans.append(digits[j]);
                        i += words[j].length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}