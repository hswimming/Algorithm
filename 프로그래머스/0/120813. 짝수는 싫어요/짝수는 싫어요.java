import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> copy = new ArrayList<Integer>();
        int num = 0;
		
        for (int i = 0; i <= n; i++) {
            if (i >= 1 && i % 2 != 0) {
                num = i;
                copy.add(num);
            }
        }
		
        int[] answer = new int[copy.size()];
		
        for (int j = 0; j < copy.size(); j++) {
            answer[j] = copy.get(j);
        }
		
        return answer;
    }
}