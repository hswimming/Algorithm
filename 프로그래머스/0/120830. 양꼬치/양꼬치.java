class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        
        for (int i = 1; i <= n; i++ ) {
            // 양꼬치 10인분 당 음료수 1개 서비스
            if (i % 10 == 0) {
                service++;
            }
        }
        
        answer = n * 12000 + k * 2000 - service * 2000;
        return answer;
    }
}