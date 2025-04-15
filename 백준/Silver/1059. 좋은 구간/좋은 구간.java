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

		int count = Integer.parseInt(br.readLine());

		int[] arr = new int[count];
		String[] input = br.readLine().split("\\s+");

		for (int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		Arrays.sort(arr);

		int num = Integer.parseInt(br.readLine());

		// num이 집합 S에 포함되어 있는지 확인
		boolean isInSet = false;
		for (int i = 0; i < count; i++) {
			if (arr[i] == num) {
				isInSet = true;
				break;
			}
		}
		// num이 집합 S에 포함되어 있다면 좋은 구간은 없음(default를 0으로)
		int result = 0;
		if (!isInSet) {
			// num보다 작은 가장 큰 원소 찾기 (left)
			int left = 0;
			for (int i = 0; i < count; i++) {
				if (arr[i] < num) {
					left = arr[i];
				} else {
					break;
				}
			}

			// num보다 큰 가장 작은 원소 찾기 (right)
			int right = 1001; // 문제 조건에 따라 최대값은 1000
			for (int i = 0; i < count; i++) {
				if (arr[i] > num) {
					right = arr[i];
					break;
				}
			}

			result = (num - left) * (right - num) - 1; // -1은 두 수가 같은 집합을 제외
		}

		bw.write(String.valueOf(result));
		bw.flush();
		br.close();
		bw.close();
	}
}
