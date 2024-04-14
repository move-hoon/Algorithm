import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean[] isPrime;
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                break;
            }

            int min = number + 1;
            int max = number * 2;

            // 20
            isPrime_fun(max, min);
        }

        for (int i = 0; i < list.size(); i++) {
            bw.write(String.valueOf(list.get(i)));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void isPrime_fun(int max, int min) {
        int answer = 0;
        isPrime = new boolean[max + 1];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = min; i <= max; i++) {
            if (isPrime[i] != false) {
                answer++;
            }
        }

        list.add(answer);
    }
}