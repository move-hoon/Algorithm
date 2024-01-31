import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] number = new int[10];
        int[] leftNumber = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            number[i] = kb.nextInt();
            leftNumber[i] = number[i] % 42;
        }

        Set<Integer> hasSet = new HashSet<>();
        for (int x : leftNumber) {
            hasSet.add(x);
        }

        System.out.println(hasSet.size());
    }
}