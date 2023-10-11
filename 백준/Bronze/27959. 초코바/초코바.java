import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int price = sc.nextInt();

        int haveMoney = number * 100;

        if(haveMoney >= price) {
            System.out.println("Yes");
        }

        else
            System.out.println("No");
    }
}