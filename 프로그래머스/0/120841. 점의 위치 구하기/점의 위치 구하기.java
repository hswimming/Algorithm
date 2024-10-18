class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if (0 < dot[0] && 0 < dot[1]) {
            answer = 1; // x 좌표와 y 좌표가 모두 양수
        } else if (dot[0] < 0 && 0 < dot[1]) {
            answer = 2; // x 좌표가 음수, y 좌표가 양수
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3; // x 좌표와 y 좌표가 모두 음수
        } else {
            answer = 4; // x 좌표가 양수, y 좌표가 음수
        }
        
        return answer;
    }
}