import java.util.Scanner;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        s = s.toLowerCase();
        for(char k : s.toCharArray()) {
            if(k == 'p') {
                pCount++;
            } else if(k == 'y') {
                yCount++;
            }
        }

        if(pCount == yCount && pCount != 0 && yCount !=0) {
            answer = true;
        } else if(pCount == 0 && yCount == 0) {
            answer = true;
        } else
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        a.solution(s);
    }
}