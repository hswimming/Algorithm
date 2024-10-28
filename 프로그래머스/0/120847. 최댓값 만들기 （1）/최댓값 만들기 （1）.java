class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int num = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // 다음 인덱스와 곱하기
                num = numbers[i] * numbers[j];
                
                if (answer <= num) { // 현재 최댓값보다 크면 변경
                    answer = num;
                }
            }
        }
        
        return answer;
    }
}