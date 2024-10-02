import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> total = new ArrayList<Integer>();
        int num = 0;
		
        for(int i = 0; i < numbers.length; i++) {
            num = numbers[i] * 2;
            total.add(num);
        }
		
        int[] answer = new int[total.size()];
		
        for(int j = 0; j < total.size(); j++) {
            answer[j] = total.get(j);
        }
		
        return answer;
    }
}