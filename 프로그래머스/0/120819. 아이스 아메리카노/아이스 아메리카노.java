class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500; // 아메리카노 잔 수
        answer[1] = money % 5500; // 잔돈
        
        return answer;
    }
}