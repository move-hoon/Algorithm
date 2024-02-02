import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double[] arr = new double[count];
        double result = 0.0;

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextDouble();
        }

        Arrays.sort(arr);

        for (int i = 0; i < count; i++) {
            arr[i] = Math.round(arr[i]/arr[count-1] * 100 * 100.0) / 100.0;
        }

        for (int i = 0; i < count; i++) {
            result += arr[i];
        }
        System.out.println(result / count);
    }
}