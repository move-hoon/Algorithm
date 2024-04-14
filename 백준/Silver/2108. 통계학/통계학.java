import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        // 평균값
        double avg = 0;
        for (int i = 0; i < count; i++) {
            avg += list.get(i);
        }

        int newAvg = (int)Math.round(avg / count);

        // 중앙값
        int middleValue = list.get(count / 2);

        // 최빈값
        int[] frequency = new int[8001]; // -4000 ~ 4000까지의 수가 주어질 수 있으므로, 8001 크기의 배열 사용
        int maxFrequency = 0;
        List<Integer> modes = new ArrayList<>();

        for (int num : list) {
            frequency[num + 4000]++;
            maxFrequency = Math.max(maxFrequency, frequency[num + 4000]);
        }

        for (int i = 0; i < 8001; i++) {
            if (frequency[i] == maxFrequency) {
                modes.add(i - 4000);
            }
        }

        int mode;
        if (modes.size() > 1) {
            Collections.sort(modes);
            mode = modes.get(1);
        } else {
            mode = modes.get(0);
        }

        // 범위
        int range = list.get(count - 1) - list.get(0);

        bw.write(String.valueOf(newAvg));
        bw.newLine();
        bw.write(String.valueOf(middleValue));
        bw.newLine();
        bw.write(String.valueOf(mode));
        bw.newLine();
        bw.write(String.valueOf(range));

        bw.flush();
        bw.close();
    }
}
