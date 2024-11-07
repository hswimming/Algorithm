class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String pattern = "[a-zA-Z]";
        // 정규 표현식을 만족하는 숫자 문자열 배열
        String[] str = my_string.split(pattern);
        
        // 자연수가 없는 경우 빈 문자열이므로 0 리턴
        for (int i = 0; i < str.length; i++) {
            answer += str[i].equals("") ? 0 : Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}