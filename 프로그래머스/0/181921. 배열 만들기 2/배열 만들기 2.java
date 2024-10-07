import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<Integer>();
        String pattern = "[05]+"; // 0과 5로만 이루어진 수
        
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches(pattern)) {
                arr.add(i); // true
            }
        }
        
        // 조건을 만족하지 못하면 빈 배열
        if (arr.isEmpty()) {
            arr.add(-1);
        }
        
        int[] answer = new int[arr.size()];
        
        for (int j = 0; j < arr.size(); j++) {
            answer[j] = arr.get(j); // 배열 복사
        }
        
        return answer;
    }
}