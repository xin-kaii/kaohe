import java.util.Scanner;

public class hsC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long pal = buildPalindrome(t);
        System.out.println(isPrime(pal) ? "prime" : "noprime");
    }

    static long buildPalindrome(long t) {
        long res = t;
        long temp = t / 10;
        while (temp > 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        return res;
    }

    static boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}