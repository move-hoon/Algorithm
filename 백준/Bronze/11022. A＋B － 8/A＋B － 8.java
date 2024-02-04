import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();
        int[] arr1 = new int[count];
        int[] arr2 = new int[count];

        for (int i = 0; i < count; i++) {
            int num1 = kb.nextInt();
            int num2 = kb.nextInt();
            arr1[i] = num1;
            arr2[i] = num2;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Case #" + (i + 1) + ": " + arr1[i] + " + " + arr2[i] +  " = " + (arr1[i] + arr2[i]));
        }
    }
}