import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// *S*S*S* -> 컵홀더 4개, 사람 3명
// *S*LL*S* -> 컵홀더 4개, 사람 4명
// 컵 홀더 개수는 = 모두 S라 가정 했을떄 개수(S+1) - LL쌍의 개수
public class Main {
	public static void main(String[] args) throws IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();

		int result = T.solution(n, s);
		bw.write(String.valueOf(result));

		bw.flush();
		bw.close();
	}

	public int solution(int n, String s) {
		int people = n;
		char[] arr = new char[s.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}

		int llCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 'L' && arr[i + 1] == 'L') {
				llCount++;
				i++;
			}
		}

		return Math.min(people + 1 - llCount, people);
	}
}