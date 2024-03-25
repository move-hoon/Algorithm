import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int number = kb.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> deleteList = new ArrayList<>();

        for (int i = 1; i < number+1; i++) {
            list.add(i);
        }

        // 1234 -> 342 -> 24 -> 4

        // 123 -> 32 -> 2

        // 1234 -> 234 -> 2342 -> 342
        for (int i = 0; i < number-1; i++) {
            deleteList.add(list.get(0));
            list.remove(0);
            list.add(list.get(0));
            list.remove(0);
        }


        for (int i = 0; i < deleteList.size(); i++) {
            System.out.println(deleteList.get(i));
        }

        System.out.println(list.get(0));
    }
}