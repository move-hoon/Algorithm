import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 간은 번호의 소가 위치를 바꾼게 몇번인지
		int seeCount = Integer.parseInt(br.readLine()); // 8개의 관찰
		int[] cows = new int[11]; // 0 ~ 10까지인데 0빼고 하면 10개의 소
		for(int i = 0; i < cows.length; i++) {
			cows[i] = -1;	// 0 ~ 10까지 -1
		}

		int count = 0;
		for(int i = 0; i < seeCount; i++) { // 0 ~ 7 8번
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken()); // 3
			int location = Integer.parseInt(st.nextToken()); // 1

			if(cows[cow] != -1) { // 처음이 아니다
				if (cows[cow] != location) {
					cows[cow] = location;
					count++;
				}
			} else { // 처음이다
				cows[cow] = location;
			}
		}

		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();
		br.close();
	}
}