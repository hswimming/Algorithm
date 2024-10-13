import java.util.*;

class Solution {
    public String solution(int age) {
        // split("") 메서드는 문자열을 분할하여 문자열 배열 형태로 반환
        String[] arr = String.valueOf(age).split("");
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            // 소문자 알파벳 a의 아스키 코드 값은 97
            // arr[i]에 저장된 문자열을 정수로 변환하여 더하기
            // 정수를 다시 문자로 변환
            answer += (char) (Integer.parseInt(arr[i]) + 97);
        }
        
        return answer;
    }
}