import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        long [] arr = new long[number + 1];

        arr[0] = 0;
        if (number > 0) {
            arr[1] = 1;
            for (int i = 2; i <= number; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        bw.write(String.valueOf(arr[number]));
        bw.flush();
        bw.close();
    }
}