import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long a = kb.nextInt();
        long b = kb.nextInt();

        long result = Math.abs(a-b);

        System.out.println(result);
    }
}