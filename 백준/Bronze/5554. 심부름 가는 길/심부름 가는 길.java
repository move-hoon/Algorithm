import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int second = 0;
        int temporary = 0;

        for (int i = 0; i < 4; i++) {
            temporary = kb.nextInt();
            second += temporary;
        }

        int hour = second / 60;
        int minute = second % 60;

        System.out.println(hour);
        System.out.println(minute);
    }
}