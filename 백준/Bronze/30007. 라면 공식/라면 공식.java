import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 필요한 물량 = 라면 계수(끓일 라면수 - 1) + 기본 물양

        // 먼저 첫번째로 끓일 라면수 입력
        // 두번째로 라면계수, 물양, 끓일 라면 수

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt(); // 라면 횟수
        int[] ramen = new int[number]; // 라면 배열
        int coefficient = 0; // 라면계수
        int water = 0; // 기본물양
        int fireNumber = 0; // 끓일 라면 수

        for (int i = 0; i < number ; i++) {
            coefficient = sc.nextInt();
            water = sc.nextInt();
            fireNumber = sc.nextInt();
            ramen[i] = coefficient*(fireNumber - 1) + water;
        }

        for (int i = 0; i < number; i++) {
            System.out.println(ramen[i]);
        }

    }
}