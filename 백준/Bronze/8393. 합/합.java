import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int sum = 0;

        for (int i = number; i > 0; i--) {
            sum += i;
        }

        System.out.println(sum);
    }
}