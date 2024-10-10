import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 배열의 숫자(키), 중복 횟수(값)
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxCount = 0;
        int answer = 0;
        
        // 중복 횟수 세기
        for (int num : array) {
            // 찾는 키가 존재하면 키의 값을 반환, 없다면 기본 값 반환
            // => map에 num이 존재하면 현재 중복 횟수 가져오기, 중복될 때마다 + 1
            int count = map.getOrDefault(num, 0) + 1;
            
            // 현재 최댓값보다 크면 새로운 최빈값 발견
            if (count > maxCount) {
                maxCount = count;
                answer = num; // 최빈값 변경
                
                // 최빈값이 여러 개인 경우
            } else if (count == maxCount) {
                answer = -1;
            }
            // 현재 최빈값, 중복 횟수 저장
            map.put(num, count);
        }
        
        return answer;
    }
}