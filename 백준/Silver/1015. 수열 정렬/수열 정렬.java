import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 첫째 줄에 배열 A의 크기 N이 주어진다. 둘째 줄에는 배열 A의 원소가 0번부터 차례대로 주어진다. N은 50보다 작거나 같은 자연수이고, 배열의 원소는 1,000보다 작거나 같은 자연수이다.

        // B[P[i]] = A[i]

        // ex) 3입력 A[3] and 2 3 1로 초기화 -> A[3] = {2, 3 ,1} -> B[P[0]] = A[0] = 2 -> P[0] = 1
        // B[P[1]] = A[1] = 3 -> P[1] = 2
        // B[P[2]] = A[2] = 1 -> P[2] = 0

        // A의 원소를 입력 받고 바로 정렬(비내림차순) 후에 ex) 1 2 3
        // 그전 원소가 ex) 2 3 1 가 각각 몇번째 순서인지 알아야함, 2는 [1] 3은 [2] 1은 [0]

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            B[i] = A[i];
        }

        // B는 버블정렬으로 정렬
        for (int i = N-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (B[j] > B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }
        // 버블정렬 했을 때 A가 2 1 3 1 이라면 B는 1 1 2 3


        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i] == B[j]) {
                    P[i] = j;
                    break;
                }
            }
        }


        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (P[i] == P[j]) {
                    P[j] += 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(P[i] + " ");
        }


    }
}