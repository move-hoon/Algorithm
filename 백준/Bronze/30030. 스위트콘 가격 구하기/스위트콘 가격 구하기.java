import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10000원인데 부가가치세 10% 적용하면 11000원
        // 부가가치세 포함가격 - 부가가치세 포함가격/11 = 부포함가격 * 10/11

        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        int priceIncludeVat = price * 10/11;

        System.out.println(priceIncludeVat);
    }
}