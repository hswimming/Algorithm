class Solution {
    public String solution(String my_string) {
        String answer = "";
        String pattern = "[aeiou]"; // 정규표현식으로 확인
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            // my_string 문자열을 char로 변환하여 확인
            char ch = my_string.charAt(i);
            
            if (String.valueOf(ch).matches(pattern) == false) {
                str.append(ch); // 모음 외 문자만 추가
            }
        }
        
        return answer = String.valueOf(str);
    }
}