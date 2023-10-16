import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 총 병사수를 분배의 기준으로 나누었을 때 나누어 떨어지면 1 아니면 0을 출력

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // 생활관 수
        int distribute = sc.nextInt(); // 분배 기준
        int[] people = new int[number]; // 생활관 별 인원
        int sum = 0; // 총 인원 수


        for (int i = 0; i < number; i++) {
            people[i] = sc.nextInt();
            sum += people[i];
        }

        if(sum % distribute == 0) {
            System.out.println(1);
        } else if (sum % distribute != 0) {
            System.out.println(0);
        }
    }
}