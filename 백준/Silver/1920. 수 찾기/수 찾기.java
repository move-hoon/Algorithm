import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr1 = new int[size];
        String[] input1 = br.readLine().split(" ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        Arrays.sort(arr1);

        int match = Integer.parseInt(br.readLine());
        int[] arr2 = new int[match];
        String[] input2 = br.readLine().split(" ");
        int[] result = new int[match];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean find = BSearch(arr1, arr2[i]);
            if (find == true) {
                result[i] = 1;
            } else
                result[i] = 0;
        }


//        int index = 0;
//        int standard = 0;
//        while (index <= arr1.length-1) {
//            if (arr1[index] == arr2[standard]) {
//                result[standard] = 1;
//                standard++;
//                index++;
//            } else {
//                index++;
//            }
//        }
//
//        // index = 5; standard = 3
//        for (int i = standard; i < arr2.length; i++) {
//            result[standard] = 0;
//        }
//
//
        for (int i = 0; i < result.length; i++) {
            bw.write(String.valueOf(result[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static boolean BSearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < n) left = mid + 1;
            else if (arr[mid] > n) right = mid - 1;
            else return true;
        }
        return false;
    }
}