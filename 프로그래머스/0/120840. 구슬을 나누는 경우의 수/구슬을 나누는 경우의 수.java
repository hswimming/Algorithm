class Solution {
    public int solution(int balls, int share) {
        // 분자 : n * (n - 1) * (n - 2) * ... * (n - m + 1)
        // 분모 : m * (m - 1) * (m - 2) * ... * 1
        
        long answer = 1; // 팩토리얼 값이 커지면 int 타입과 맞지 않음
        
        for (int i = 1; i <= share; i++) {
            answer = answer * (balls - i + 1) / i;
        }
        
        return (int) answer;
    }
}