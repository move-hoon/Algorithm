import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 패티와 치즈는 번갈아 쌓아야 함, 패티개수 = 치즈 + 1;
        // 치즈버거 크기 = 패티 + 치즈


        Scanner sc = new Scanner(System.in);
        int pattyNum = sc.nextInt(); // 패티수

        int cheeseNum = sc.nextInt(); // 치즈수
        int burgerMax; // 버거 최대 크기

        if (pattyNum > cheeseNum) {
            pattyNum = cheeseNum + 1;
            burgerMax = pattyNum + (pattyNum-1);
            System.out.println(burgerMax);
        }

        else if (pattyNum <= cheeseNum) {
            cheeseNum = pattyNum - 1;
            burgerMax = pattyNum + cheeseNum;
            System.out.println(burgerMax);
        }


    }
}
