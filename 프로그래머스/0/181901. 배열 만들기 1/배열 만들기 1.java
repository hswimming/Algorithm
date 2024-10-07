import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> arr = new ArrayList<Integer>();
        int num = 0;
        
        // k의 배수가 n을 초과하지 않도록
        for (int i = 1; 1 <= k && k * i <= n; i++) {
            num = k * i; // k의 배수
            arr.add(num); // 리스트에 추가
        }
        
        // 리스트의 길이만큼 배열 생성
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i); // 리스트 값 넣어주기
        }
        
        return answer;
    }
}