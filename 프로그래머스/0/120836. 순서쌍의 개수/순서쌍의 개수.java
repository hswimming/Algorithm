class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) { // 0을 나눌 수 없으므로 1부터 시작
            if (n % i == 0) { // n의 약수 개수
                answer++;
            }
        }
        
        return answer;
    }
}