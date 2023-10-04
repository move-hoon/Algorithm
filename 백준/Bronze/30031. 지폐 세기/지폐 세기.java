import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 136, 142, 148. 154

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] width = new int[count];
        int length = 0;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            width[i] = sc.nextInt();
            length = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if (width[i] == 136) {
                sum += 1000;
            }
            else if (width[i] == 142) {
                sum += 5000;
            }
            else if (width[i] == 148) {
                sum += 10000;
            }
            else if (width[i] == 154) {
                sum += 50000;
            }
            else
                System.out.println("가로를 다시 입력해주세요");
        }

        System.out.println(sum);
    }
}