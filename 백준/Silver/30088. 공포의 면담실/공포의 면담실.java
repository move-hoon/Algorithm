import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int departmentNum; // 부서 수
        departmentNum = sc.nextInt(); // 부서 수 입력

        int[] department = new int[departmentNum]; // 부서 배열
        int[] num = new int[departmentNum]; // 직원 수 배열
        int minuteSum = 0; // 소요 시간 합
        int quitTime = 0; // 퇴근 시간
        int result = 0; // 최종 총합(결과)
        int numSum = 0; // 총 회사 직원 수의 총합

        for (int i = 0; i < departmentNum; i++) {
            num[i] = sc.nextInt(); // num[0] = 2

            int[] minute = new int[num[i]]; // 소요 시간(분)
            for (int j = 0; j < num[i]; j++) { // minute[0], minute[1]로 두번 소요 시간 저장
                    minute[j] = sc.nextInt();
            }

            for (int k = 0; k < num[i]; k++) {
                    minuteSum += minute[k]; // minute[0] + minute[1] 해서 minuteSum에 저장
            }

            department[i] = minuteSum; // 그거를 department[0]에 저장
            minuteSum = 0; // 다음을 위해 초기화
        }

        for (int i = 0; i < departmentNum; i++) {
            numSum += num[i];
        }


        if (numSum <= 1000) {
            // 버블 소트
            for (int i = departmentNum-1; i > 0 ; i--) {
                for (int j = 0; j < i; j++) {
                    if (department[j] > department[j + 1]) {
                        int temp = department[j];
                        department[j] = department[j + 1];
                        department[j + 1] = temp;
                    }
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
}
