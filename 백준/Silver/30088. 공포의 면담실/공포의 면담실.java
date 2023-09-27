import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int departmentNum = sc.nextInt(); // 부서 수
        int[] department = new int[departmentNum]; // 부서 배열
        int num = 0; // 직원수
        int minuteSum = 0; // 소요 시간 합
        int quitTime = 0; // 퇴근 시간
        int result = 0; // 최종 총합

        for (int i = 0; i < departmentNum; i++) {
            num = sc.nextInt();
            int[] minute = new int[num]; // 소요 시간(분)
            for (int j = 0; j < num; j++) {
                minute[j] = sc.nextInt();
            }

            for (int k = 0; k < num; k++) {
                minuteSum += minute[k];
            }

            department[i] = minuteSum;
            minuteSum = 0;
        }

        // 작은수 부터 줄세우기 알고리즘
        for (int i = 0; i < departmentNum-1; i++) {
            if (department[i] > department[i+1]) {
                int temp = department[i];
                department[i] = department[i+1];
                department[i+1] = temp;
            }
        }

        // 소요시간 + 앞에서 소요한 시간(웨이팅 시간) = 퇴근 시간
        // 퇴근 시간 배열로 리팩토링
        int[] quit = new int[departmentNum];
        for (int i = 0; i < departmentNum; i++) {
            quitTime += department[i];
            quit[i] = quitTime;
        }

        // 퇴근 시간 합
        for (int i = 0; i < departmentNum; i++) {
            result += quit[i];
        }

        System.out.println(result);
    }
}