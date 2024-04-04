import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] num1 = new int[count];
        int[] num2 = new int[count];

        for (int i = 0; i < count; i++) {
            num1[i] = kb.nextInt();
            num2[i] = kb.nextInt();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(lcm(num1[i], num2[i]));
        }
    }

    // A x B = G(최대공약수) * L(최소공배수)
    public static int gcd(int a, int b) {
        int result = 0;

        while(a % b != 0) {
            result = a % b;
            a = b;
            b = result;
        }

        return b;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}