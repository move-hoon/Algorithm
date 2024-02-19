import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[][] arr1 = new int[num1][num2];
        int[][] arr2 = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr1[i][j] = kb.nextInt();
            }
        }
        
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr2[i][j] = kb.nextInt();
            }
        }

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}