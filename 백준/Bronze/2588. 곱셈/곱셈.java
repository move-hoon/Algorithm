import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[3];
        int result = 0;

        arr[0] = y / 100;
        arr[1] = (y % 100) / 10;
        arr[2] = (y % 100) % 10;


        for (int i = 2; i >= 0; i--) {
            System.out.println(arr[i] * x);
        }

        result = x  * (arr[2] + arr[1] * 10 + arr[0] * 100);
        System.out.println(result);
    }
}