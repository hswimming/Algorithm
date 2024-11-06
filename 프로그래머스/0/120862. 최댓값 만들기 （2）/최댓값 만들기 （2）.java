class Solution {
    public int solution(int[] numbers) {
        // 정수의 최소값은 -231(-2,147,483,648)
        // 맨 처음 최댓값 중 음수가 있을 수 있으므로 사용
        int answer = Integer.MIN_VALUE;
        int max = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 다음 인덱스와 곱하기
                max = numbers[i] * numbers[j];
                
                if (answer <= max) { // 현재 최댓값보다 크면 변경
                    answer = max;
                }
            }
        }
        
        return answer;
    }
}