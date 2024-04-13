import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        int count = kb.nextInt();

        for (int i = 0; i < count; i++) {
            int number = kb.nextInt();
            int size = list.size();

            if (number != 0) {
                list.add(number);
            } else {
                list.remove(size - 1);
            }
        }

        for (Integer i : list) {
            sum += i;
        }

        System.out.println(sum);
    }
}