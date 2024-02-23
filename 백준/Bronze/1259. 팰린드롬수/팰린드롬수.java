import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = 0;
        List<String> arr = new ArrayList<>();

        while(true) {
            String number = kb.next();
            StringBuilder sb = new StringBuilder(number);

            if(number.equals("0")) {
                break;
            } else if (!number.equals("0")) {
                if (sb.reverse().toString().equals(number)) {
                    arr.add("yes");
                } else
                    arr.add("no");
            }
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(arr.get(i));
        }
    }
}