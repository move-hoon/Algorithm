import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        int number = 0;

        for (int i = 0; i < count; i++) {
            number = Integer.parseInt(br.readLine());
            arr[i] = number;
        }

        Arrays.sort(arr);

        for (int i : arr) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
