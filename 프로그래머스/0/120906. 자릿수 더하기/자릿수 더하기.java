class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 숫자 => 문자
        // String num = Integer.toString(n);
        String num = n + "";
        
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            
            // char => String
            // answer += Integer.parseInt(String.valueOf(c));
            answer += Integer.parseInt(c + "");
        }
        
        return answer;
    }
}