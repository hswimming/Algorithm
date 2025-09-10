class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        /* 
            처음 배열에 있던 일치하는 번호 개수 + 0 개수 = 최고 순위
            처음 배열에 있던 일치하는 번호 개수 = 최저 순위
        */
        int[] answer = {};
        int count = 0; // 일치하는 번호 개수
        int zero = 0; // 0의 개수
        
        for (int i = 0 ; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == 0) {
                    zero++;
                    break;
                } else if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }
        
        // 일치하는 번호가 없으면 6등
        int max = 1 < (count + zero) ? 7 - (count + zero) : 6;
        int min = 1 < count ? (7 - count) : 6;
        
        return answer = new int[] {max, min};
    }
}