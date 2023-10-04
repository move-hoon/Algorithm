import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 1 2 2 2 8 (킹, 퀸, 룩, 비숍, 나이트, 폰)
        // 0<= 입력값 <= 10

        Scanner sc = new Scanner(System.in);

        int[] chess = new int[] {1, 1, 2, 2, 2, 8};
        int[] discover = new int[6];
        int[] sort = new int[6];

        for (int i = 0; i < 6; i++) {
            discover[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            sort[i] = chess[i] - discover[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(sort[i] + " ");
        }
    }
}
