import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int originNumber = number;
        int newNum = 0;
        int count = 0;

        while (true) {
            int leftNum = number / 10;
            int rightNum = number % 10;

            int sum = leftNum + rightNum;

            newNum = rightNum * 10 + sum % 10;

            if (newNum == originNumber) {
                count++;
                break;
            } else {
                count++;
            }

            number = newNum;
        }
        System.out.print(count);
    }
}