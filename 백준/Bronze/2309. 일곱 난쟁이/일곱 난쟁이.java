import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int number = kb.nextInt();
            list.add(number);
        }

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += list.get(i);
        }

        Collections.sort(list);

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - list.get(i) - list.get(j) == 100) {
                    index1 = i;
                    index2 = j;
                }
            }
        }

        list.remove(index2);
        list.remove(index1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}