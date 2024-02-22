import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int diagonal = kb.nextInt();
        int verticalRatio = kb.nextInt();
        int horizontalRatio = kb.nextInt();

        double xSquare = Math.pow(diagonal, 2) / (Math.pow(verticalRatio, 2) + Math.pow(horizontalRatio, 2));
        double x = Math.sqrt(xSquare);

        double vertical = verticalRatio * x;
        double horizontal = horizontalRatio * x;

        System.out.print((int)Math.floor(vertical) + " "  + (int)Math.floor(horizontal));
    }
}