import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N개의 수를 담은 수열를 오름차순으로 정렬

        // A[N-1]값이 가장 커야함 스왑했을떄

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i <= N-3; i++) {
            array[i] = random.nextInt(10000) + 1;
        }
        array[N-1] = 0;
        array[N-2] = 0;

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }



    }
}