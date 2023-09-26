import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        int difference = 0;
        x = sc.nextInt();
        y = sc.nextInt();

        difference = x - y;
        System.out.println(difference);
    }
}