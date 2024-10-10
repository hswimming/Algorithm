import java.util.*;

class Solution {
    public int solution(String s) {
        // 문자열을 확인할 때 조작하기 위해 선언
        StringBuilder result = new StringBuilder();
        int answer = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // i번째 특정 문자를 char 타입으로 변환
            
            // 빈 문자열이 아닌지 확인 후 마지막으로 추가한 문자와 현재 문자가 같은지 확인
            if (result.length() > 0 && result.charAt(result.length() - 1) == ch) {
                // 마지막 문자와 같으므로 같은 문자 모두 제거
                result.deleteCharAt(result.length() - 1);
            } else {
                // 다를 경우 현재 문자를 문자열에 추가
                result.append(ch);
            }
        }
        
        // 모두 짝지어서 제거되면 빈 문자열이므로 1 반환 아니면 0 반환
        return answer = result.length() == 0 ? 1 : 0;
    }
}