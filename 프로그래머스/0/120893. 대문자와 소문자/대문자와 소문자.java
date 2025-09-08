class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            // 전달된 값이 대문자인 경우 true, 그렇지 않으면 false
            if (Character.isUpperCase(c)) {
                answer += (c + "").toLowerCase();
            } else {
                answer += (c + "").toUpperCase();
            }
        }
        
        return answer;
    }
}