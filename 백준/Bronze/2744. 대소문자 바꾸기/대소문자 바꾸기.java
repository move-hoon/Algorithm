import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String s = kb.next();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isLowerCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            } else
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        }
        System.out.println(sb);
    }
}
