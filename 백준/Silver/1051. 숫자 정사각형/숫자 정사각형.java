import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split("\\s+");
		int width = Integer.parseInt(arr[0]);
		int length = Integer.parseInt(arr[1]);

		char[][] box = new char[width][length];
		for (int i = 0; i < width; i++) {
			String line = br.readLine();
			for (int j = 0; j < length; j++) {
				box[i][j] = line.charAt(j);
			}
		}

		int min = Math.min(width, length);
		int maxSize = 1;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				for (int k = 1; k <= min; k++) {
					int a = i + k;
					int b = j + k;

					if (a > width - 1 || b > length - 1) {
						continue;
					}

					char lt = box[i][j];
					char rt = box[i][b];
					char lb = box[a][j];
					char rb = box[a][b];

					if (lt == rt && lt == lb && lt == rb) {
						maxSize = Math.max(maxSize, (k + 1) * (k + 1));
					}
				}
			}
		}

		bw.write(String.valueOf(maxSize));

		bw.flush();
		br.close();
		bw.close();
	}
}
