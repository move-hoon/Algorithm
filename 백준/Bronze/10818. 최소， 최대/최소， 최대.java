import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] arr = new int[count];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int a = min;

        for (int i = 0; i < count; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < count; i++) {
            if(arr[i] < a) {
                min = arr[i];
                a = min;
            }
        }

        System.out.print(min + " " + max);
    }
}