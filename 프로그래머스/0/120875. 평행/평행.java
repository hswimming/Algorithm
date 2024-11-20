class Solution {
    public int solution(int[][] dots) {
        // 직선이 평행하다 => 두 직선의 기울기가 같다
        // 직선의 기울기 => y값의 변화량 / x값의 변화량
        // 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우
        // 3가지 경우의 수 => [a-b, c-d], [a-c, b-d], [a-d, b-c]
        
        int answer = 0;
        
        if ((double) (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]) == (double) (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]))
            answer = 1; // [a-b, c-d]
        
        if ((double) (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]) == (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]))
            answer = 1; // [a-c, b-d]
        
        if ((double) (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]) == (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]))
            answer = 1; // [a-d, b-c]
        
        return answer; // if문 값이 같으면 두 직선의 기울기가 같으므로 평행
    }
}