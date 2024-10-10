import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int even = 0; // 짝수 개수
        int odd = 0; // 홀수 개수
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        int[] answer = {even, odd};
        return answer;
    }
}