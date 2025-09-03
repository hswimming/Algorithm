class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = (int) Math.sqrt(n);
        
        // 제곱수라면 계속 나눴을 때 나머지 == 0
        while (n % num == 0) {
            n /= num;
            
            // 제곱수가 아닐 경우 소수점으로
            if (n < 0) break;
        }
        
        return answer = (n == 1) ? 1 : 2;
    }
}