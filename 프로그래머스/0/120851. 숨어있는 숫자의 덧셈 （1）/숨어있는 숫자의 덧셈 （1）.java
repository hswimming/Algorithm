class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String pattern = "[a-zA-Z]"; // 정규 표현식으로 확인
        
        for (int i = 0; i < my_string.length(); i++) {
            // my_string 문자열을 char로 변환하여 한 글자씩 확인
            char ch = my_string.charAt(i);
            
            // 자연수일 경우 String => int 변환 후 연산
            if (String.valueOf(ch).matches(pattern) == false) {
                answer += Integer.parseInt(String.valueOf(ch));
            }
        }
        
        return answer;
    }
}