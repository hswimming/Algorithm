class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제곱수 => 나머지 == 0
        return answer = (n % Math.sqrt(n) == 0) ? 1 : 2;
    }
}