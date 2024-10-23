class Solution {
    public int solution(int[] box, int n) {
        // 가로 10, 세로 8, 높이 6 이라면
        // 모서리 3인 주사위는 가로 3, 세로 2, 높이 2 이므로 3 * 2 * 2 = 12
        
        int answer = 0;
        return answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}