import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 최종
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] a = new int[n];
		int[] b = new int[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		// 투포인터로 두 정렬된 배열 합치기
		StringBuilder sb = new StringBuilder();
		int pA = 0, pB = 0;
		while (pA < n && pB < m) {
			if (a[pA] <= b[pB]) {
				sb.append(a[pA++]).append(" ");
			} else {
				sb.append(b[pB++]).append(" ");
			}
		}

		while (pA < n) {
			sb.append(a[pA++]).append(" ");
		}

		while (pB < m) {
			sb.append(b[pB++]).append(" ");
		}

		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
