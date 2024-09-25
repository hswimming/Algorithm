class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i]; // 배열 요소의 합
        }
        
        return answer / numbers.length; // 배열 요소의 합 / 나눌 요소의 수
    }
}