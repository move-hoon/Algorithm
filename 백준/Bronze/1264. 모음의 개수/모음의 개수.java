import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 배열에서 a,e,i,o,u 만나면 sum += 1 로 구현
        // 배열을 여러개 선언할 필요없이 한개의 배열로 여러번 초기화 하자

        Scanner sc = new Scanner(System.in);
        char[] arr = new char[255]; // 문자 배열 생성
        int sum = 0; // aeiou 개수용 sum
        int count = 0; // 문자열 받은 횟수
        int[] sumNumber = new int[100];

        while(true) {
            String sentence = sc.nextLine(); // 문자열 입력받음
            if (sentence.equals("#")) {
                break;
            }

            else {
                // 문자열을 문자배열로 바꾸기
                for (int i = 0; i < sentence.length(); i++) {
                    arr[i] = sentence.charAt(i);
                }

                for (int i = 0; i < sentence.length(); i++) {
                    if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                        sum += 1;
                    }

                }
                
                sumNumber[count] = sum;
                sum = 0;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(sumNumber[i]);
        }
    }
}