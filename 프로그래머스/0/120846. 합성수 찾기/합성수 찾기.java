class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int count = 0; // for문 돌 때마다 초기화
            
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++; // 약수이면 count 증가
                }
            }
            
            if (3 <= count) {
                answer++; // 약수의 개수가 세 개 이상인 수
            }
        }
        
        return answer;
    }
}