import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> num = new ArrayList<Integer>();
        
        for (int i = 0; i < numlist.length; i++) {
            // 나머지 0 == n의 배수
            if (numlist[i] % n == 0) num.add(numlist[i]);
        }
        
        int[] answer = new int[num.size()];
        
        for (int i = 0; i < num.size(); i++) {
            // 리스트 값 꺼내기
            answer[i] = num.get(i);
        }
        
        return answer;
    }
}