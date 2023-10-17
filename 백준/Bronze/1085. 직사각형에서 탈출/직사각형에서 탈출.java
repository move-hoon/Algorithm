import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 직사각형 가로 : w, 세로 : h
        // 직사각형 경계선 까지 최소거리
        // 현재 위치 (x,y)
        // (0,0) (x,0) (0,y) (x,y)

        // 상 하 좌 우 : h-y y-0 x-0 w-x 중에 제일 작은게 최소거리

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int up = h-y;
        int right = w-x;
        // 하 좌 : y x

        int[] arr = new int[] {up, y, x, right};
        Arrays.sort(arr); // sort 함수 사용 -> 배열 오름차순 정렬

        System.out.println(arr[0]); // 배열 0번째 index에 가장 작은 값을 정렬했기 때문에 index 0 출력
    }
}