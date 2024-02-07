import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int limit = kb.nextInt();
        int i = 1;

        while (i <= limit) {
            System.out.println(i);
            i++;
        }
    }
}