import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int avg = kb.nextInt();

        int total = num1 * (avg - 1);

        System.out.println(total + 1);
    }
}