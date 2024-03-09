import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String sentence = kb.next();

        char[] s = sentence.toCharArray();

        System.out.println(s.length);
    }
}
