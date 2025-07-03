class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 문자열 => 단어
            
            for (int j = 0; j < index; j++) {
                c += 1; // 아스키 코드 값으로 연산됨
                
                // 알파벳이 z를 넘어갈 경우 다시 a로 돌아감
                if ('z' < c) c -= 26; // 97 ~ 122
                
                // (char => String) skip에 포함된 문자 제외
                if (skip.contains(String.valueOf(c))) j--;
            }
            answer += c;
        }
        return answer;
    }
}