import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        int result = ((x+1) * (y+1));
        System.out.println(result);
    }
}