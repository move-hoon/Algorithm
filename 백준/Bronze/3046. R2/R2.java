import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r1 = kb.nextInt();
        int average = kb.nextInt();

        int r2 = 2  * average - r1;
        System.out.println(r2);
    }
}
