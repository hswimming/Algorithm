class Solution {
    public int[] solution(int[] emergency) {
        // [3, 76, 24] => [3, 1, 2]
        // 3과 같거나 3보다 큰 수의 개수는 3개
        // 76과 같거나 76보다 큰 수의 개수는 1개
        // 24와 같거나 24보다 큰 수의 개수는 2개
        
        int[] answer = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                // 자기 자신과 같거나 큰 수의 개수 = 인덱스 + 1
                if (emergency[i] <= emergency[j]) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}