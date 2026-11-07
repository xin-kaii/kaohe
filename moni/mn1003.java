import java.io.InputStream;

public class mn1003 {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = in.read()) != -1) {
            sb.append((char) b);
        }

        String s = sb.toString();
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        boolean inStr = false;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '\\' && i + 1 < n && s.charAt(i + 1) == '"') {
                ans.append(c).append(s.charAt(i + 1));
                i++;
                continue;
            }

            if (inStr) {
                if (c == '"') inStr = false;
                ans.append(c);
            } else {
                if (c == '"') {
                    inStr = true;
                    ans.append(c);
                } else if (c == '/' && i + 1 < n && s.charAt(i + 1) == '*') {
                    int j = i + 2;
                    while (j + 1 < n && !(s.charAt(j) == '*' && s.charAt(j + 1) == '/')) {
                        j++;
                    }
                    if (j + 1 < n) {
                        i = j + 1;
                    } else {
                        ans.append("/*");
                        i++;
                    }
                } else {
                    ans.append(c);
                }
            }
        }
        System.out.print(ans);
    }
}