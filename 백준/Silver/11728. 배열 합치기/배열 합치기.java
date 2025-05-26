import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] volume = br.readLine().split(" ");
		int[] a = new int[Integer.parseInt(volume[0])];
		int[] b = new int[Integer.parseInt(volume[1])];
		int[] c = new int[a.length + b.length];

		String[] arrA = br.readLine().split(" ");
		String[] arrB = br.readLine().split(" ");

		for (int i = 0; i < a.length; i++) {
			c[i] = Integer.parseInt(arrA[i]);
		}

		for (int i = 0; i < c.length - a.length; i++) {
			c[a.length + i] = Integer.parseInt(arrB[i]);
		}

		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			bw.write(String.valueOf(c[i]) + " ");
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
