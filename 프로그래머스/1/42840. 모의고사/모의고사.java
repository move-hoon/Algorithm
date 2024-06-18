import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (first[i % 5] == answers[i]) {
                count1++;
            }

            if (second[i % 8] == answers[i]) {
                count2++;
            }

            if (third[i % 10] == answers[i]) {
                count3++;
            }
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> answerlist = new ArrayList<>();

        list.add(count1);
        list.add(count2);
        list.add(count3);

        int max = Math.max(list.get(0), Math.max(list.get(1), list.get(2)));

        for (int i = 0; i <= 2; i++) {
            if (max == list.get(i)) {
                answerlist.add(i + 1);
            }
        }

        Collections.sort(answerlist);
        int[] answer = answerlist.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }
}