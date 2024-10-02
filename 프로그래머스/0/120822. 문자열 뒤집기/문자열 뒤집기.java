class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 문자열 길이 - 1 => 마지막 문자
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i); // 자동 형 변환
        }
        
        return answer;
    }
}