import java.util.Scanner;

public class zE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                stack[++top] = c;
            } else {
                if (top < 0) {
                    System.out.println("Bad");
                    return;
                }
                top--;
            }
        }

        System.out.println(top < 0 ? "Good" : "Bad");
    }
}