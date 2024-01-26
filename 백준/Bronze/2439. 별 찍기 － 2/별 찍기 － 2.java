import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb  = new Scanner(System.in);
        int count = kb.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - (i+1); j++) {
                System.out.print(" ");
            }
            for (int j = count; j >= count - i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}