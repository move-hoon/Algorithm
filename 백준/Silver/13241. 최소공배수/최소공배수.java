import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        long num1 = kb.nextInt();
        long num2 = kb.nextInt();

        System.out.println(lcm(num1, num2));
    }

    public static long gcd(long a, long b) {
        long result = 0;

        while (a % b != 0) {
            result = a % b;
            a = b;
            b = result;
        }

        return b;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}