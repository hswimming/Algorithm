class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (angle == 180) {
            answer = 4; // 평각
        } else if (90 < angle && angle < 180) {
            answer = 3; // 둔각
        } else if (angle == 90) {
            answer = 2; // 직각
        } else {
            answer = 1; // 예각
        }
        
        return answer;
    }
}