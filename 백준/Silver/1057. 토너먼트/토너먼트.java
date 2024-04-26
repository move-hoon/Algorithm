import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 참가자 홀수, 마지막 번호 부전승
        // 우승하면 이제 다시 번호를 매긴다. 앞에서부터 매긴다.
        int participants = Integer.parseInt(st.nextToken());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        List<Integer> versus = new ArrayList<>();
        for (int i = 0; i < participants; i++) {
            versus.add(i);
        }

        int round = 0;
        while (num1 != num2) {
            num1 = num1 / 2 + num1 % 2; // 8 -> 4 -> 2 -> 1
            num2 = num2 / 2 + num2 % 2; // 9 -> 5 -> 3 -> 2 - > 1
            round++;
        }
        
        bw.write(String.valueOf(round));
        bw.flush();
        bw.close();
    }
}