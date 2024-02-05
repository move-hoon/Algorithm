import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = kb.nextInt();
            arr[i] = arr[i] * arr[i];
            sum += arr[i];
        }

        System.out.println(sum % 10);
    }
}