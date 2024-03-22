import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();

        Set<Integer> hash = new HashSet<>();

        for (int i = 0; i < count; i++) {
            int a = kb.nextInt();
            hash.add(a);
        }

        List<Integer> list = new ArrayList<>(hash);
        Collections.sort(list);

        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i));
        }
    }
}