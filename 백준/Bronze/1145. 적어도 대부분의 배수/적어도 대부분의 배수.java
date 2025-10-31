import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		int[] arr = new int[s.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		int n = 0;
		while(true) {
			int count = 0;
			n++;

			for (int i = 0; i < arr.length; i++) {
				if (n % arr[i] == 0) {
					count++;
				}
			}

			if (count >= 3) break;
		}

		bw.write(String.valueOf(n));

		bw.close();
		br.close();
	}
}