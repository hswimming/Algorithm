class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i); // 반복문 돌면서 문자열을 char 타입으로 변환
            
            // letter는 길이가 1인 영문자, 다를 경우에만 result에 추가
            if (ch != letter.charAt(0)) {
                result.append(ch);
            }
        }
        
        // StringBuilder => String 변환
        return answer = String.valueOf(result);
    }
}