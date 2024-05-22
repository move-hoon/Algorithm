import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];
        List<Double> temporary = new ArrayList<>();
        int count = 0;
        int k = 1;
        int totalPeople = stages.length;
        double failRate = 0;

        while(k <= N) {
            for(int i = 0; i < stages.length; i++) {
                if(stages[i] == k) {
                    count++;
                }
            }

            if (totalPeople > 0) {
                failRate = (double) count / totalPeople;
            } else {
                failRate = 0;
            }

            temporary.add(failRate);
            totalPeople = totalPeople - count;
            count = 0;
            k++;
        }

        double[] arr = new double[temporary.size()];
        for(int i = 0; i < temporary.size(); i++) {
            arr[i] = temporary.get(i);
            System.out.println(arr[i]);
        }

        Collections.sort(temporary, Collections.reverseOrder());
        System.out.println(temporary);


        boolean[] visited = new boolean[arr.length];  
        for (int i = 0; i < temporary.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (temporary.get(i).equals(arr[j]) && !visited[j]) {
                    answer[i] = j + 1;  
                    visited[j] = true;  
                    break;
                }
            }
        }
        
        return answer;
    }
}