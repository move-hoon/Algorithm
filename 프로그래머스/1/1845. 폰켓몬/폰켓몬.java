import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int bag = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i : nums) {
            set.add(i);
        }
        
        answer = Math.min(set.size(), bag);
        
        return answer;
    }
}