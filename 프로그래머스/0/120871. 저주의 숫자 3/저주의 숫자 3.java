class Solution {
    public int solution(int n) {
        int num = 1; // 3x 마을에서 쓰는 숫자
        int answer = 0;
        
        // i가 n일 때 3x 마을에서 쓰는 숫자 찾기
        for (int i = 1; i <= n; i++) {
            // 3으로 나누어떨어지면 3의 배수
            // num을 문자열로 변환 후 3 포함 여부 확인
            while (num % 3 == 0 || String.valueOf(num).contains("3")) {
                num++; // 조건을 만족하지 않을 때까지 num 확인
            }
            answer = num;
            num++; // i가 n이 될 때까지 계속 확인
        }
        
        return answer;
    }
}