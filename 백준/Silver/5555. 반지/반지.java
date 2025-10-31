import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		int num = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < num; i++) {
			String ring = br.readLine();
			String straightRing = ring + ring;

			if (straightRing.contains(s)) count++;
		}

		bw.write(String.valueOf(count));
		bw.close();
		br.close();
	}
}