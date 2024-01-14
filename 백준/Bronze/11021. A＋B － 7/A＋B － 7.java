import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count  = kb.nextInt();

        for (int i = 0; i < count; i++) {
            int num1 = kb.nextInt();
            int num2 = kb.nextInt();

            int sum = num1 + num2;
            System.out.println("Case #" + (i+1) + ": " + sum);
        }
    }
}