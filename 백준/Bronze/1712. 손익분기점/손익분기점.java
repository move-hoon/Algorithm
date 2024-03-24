import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int fixedCost = kb.nextInt();
        int variableCost = kb.nextInt();
        int sellingCost = kb.nextInt();

        if (sellingCost > variableCost) {
            int total = fixedCost / (sellingCost - variableCost) + 1;
            System.out.println(total);
        } else
            System.out.println(-1);
    }
}