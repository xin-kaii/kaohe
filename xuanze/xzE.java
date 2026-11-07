import java.util.Scanner;

public class xzE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        if (Y % X == 0) {
            System.out.println(X + Y);
        } else {
            System.out.println(Y - X);
        }
    }
}
