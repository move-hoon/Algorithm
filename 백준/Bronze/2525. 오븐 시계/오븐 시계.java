import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int hour = kb.nextInt();
        int min = kb.nextInt();

        int plusMin = kb.nextInt();

        min = hour * 60 + min + plusMin;

        hour = min / 60;
        min = min % 60;

        if (hour >= 24) {
            hour = hour % 24;
        }

        System.out.print(hour + " " + min);
    }
}