import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int number = kb.nextInt();

        int[][] big = new int[number][2];
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            big[i][0] = kb.nextInt();
            big[i][1] = kb.nextInt();
        }


        for (int i = 0; i < number; i++) {
            int rank = 1;

            for (int j = 0; j < number; j++) {
                if (big[i][0] < big[j][0] && big[i][1] < big[j][1]) {
                    rank++;
                }
            }

            result[i] = rank;
        }

        for (int i = 0; i < number; i++) {
            System.out.print(result[i] + " ");
        }
    }
}