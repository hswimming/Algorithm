class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0; // x가 나온 횟수
        int other = 0; // x가 아닌 다른 글자들이 나온 횟수
        char c = s.charAt(0); // s의 첫 번째 문자
        
        for (int i = 0; i < s.length(); i++) {
            if (same == other) {
                answer++;
                c = s.charAt(i); // c에 다음 문자 넣기
            }
            
            if (c == s.charAt(i)) {
                same++;
            } else {
                other++;
            }
        }
        
        return answer;
    }
}