import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String sentence = kb.nextLine().trim(); // 문장 양 끝의 공백 제거
        int count = 0;

        if (!sentence.isEmpty()) { // 문장이 비어있지 않은 경우에만 진행
            // 첫 번째 단어는 항상 공백 이후에 나오므로, 단어의 개수를 1로 초기화
            count = 1;

            // 공백을 기준으로 단어를 분리하여 개수를 세기
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
