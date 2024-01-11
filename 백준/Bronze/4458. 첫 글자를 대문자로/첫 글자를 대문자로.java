import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        kb.nextLine();
        StringBuilder[] arr = new StringBuilder[number];

        for (int i = 0; i < number; i++) {
            String input = kb.nextLine();
            arr[i] = new StringBuilder(input);

            char ch = arr[i].charAt(0);
            if (Character.isLowerCase(ch)) {
                arr[i].setCharAt(0,  Character.toUpperCase(ch));
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(arr[i]);
        }
    }
}
