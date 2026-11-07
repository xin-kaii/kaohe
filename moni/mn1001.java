import java.util.Scanner;

public class mn1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();

        char[] c = s.toCharArray();
        int dot = s.indexOf('.');
        if (dot == -1 || t == 0) {
            System.out.println(s);
            return;
        }

        int idx = -1;
        for (int i = dot + 1; i < n; i++) {
            if (c[i] >= '5') {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println(s);
            return;
        }

        int len = idx;
        int i = idx - 1;
        t--;
        boolean hasLeadingOne = false;

        while (i >= 0) {
            if (i == dot) {
                len = dot;
                i--;
                while (i >= 0 && c[i] == '9') {
                    c[i] = '0';
                    i--;
                }
                if (i >= 0) {
                    c[i]++;
                } else {
                    hasLeadingOne = true;
                    len = 0;
                }
                break;
            }

            if (c[i] == '9') {
                c[i] = '0';
                len = i;
                i--;
            } else {
                c[i]++;
                len = i + 1;
                if (c[i] >= '5' && t > 0) {
                    t--;
                    i--;
                } else {
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (hasLeadingOne) {
            sb.append('1');
            for (int j = 0; j < dot; j++) {
                sb.append('0');
            }
        } else {
            for (int j = 0; j < len; j++) {
                sb.append(c[j]);
            }
        }

        if (sb.indexOf(".") != -1) {
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1);
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        System.out.println(sb);
    }
}