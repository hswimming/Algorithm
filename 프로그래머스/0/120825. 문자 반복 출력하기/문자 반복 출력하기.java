class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            // i번째 인덱스의 문자
            char ch = my_string.charAt(i);
            
            // 해당 문자를 n번 만큼 문자열에 추가
            for (int j = 0; j < n; j++) {
                result.append(ch);
            }
        }
        
        // StringBuilder => String 변환
        return answer = String.valueOf(result);
    }
}