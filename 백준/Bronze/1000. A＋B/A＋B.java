import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0 && x < 100 &&  y < 100){
            System.out.println(x+y);
        }
    }
}