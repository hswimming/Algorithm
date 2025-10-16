import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();
        
        // X 문자열 각 문자 등장 횟수
        for (char c : X.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }
        
        // Y 문자열 각 문자 등장 횟수
        for (char c : Y.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // 정수 k(0 ≤ k ≤ 9) 범위, 내림차순 정렬로 확인
        for (char c = '9'; '0' <= c; c--) {
            // 공통 값(키) 확인
            if (countX.containsKey(c) && countY.containsKey(c)) {
                // 양쪽에 값이 있어야 공통으로 나타나는 정수 => 최소값으로 확인
                // 최대값으로 확인하면 X에는 없고 Y에는 1번만 등장해도 최대값이므로 추가됨
                int num = Math.min(countX.get(c), countY.get(c));
                
                // 공통 정수 num번 반복 넣기
                sb.append(String.valueOf(c).repeat(num));
            }
        }
        
        if (sb.length() == 0) {
            return "-1";
        } else if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return answer = sb.toString();
    }
}