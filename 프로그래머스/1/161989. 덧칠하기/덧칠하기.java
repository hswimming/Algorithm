class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0; // 페인트칠 된 마지막 위치
        
        for (int i = 0; i < section.length; i++) {
            // 작을 경우 해당 벽은 이미 롤러로 칠해짐
            if (section[i] < paint) {
                continue;
            }
            // 현재 위치(wall)부터 롤러(m)길이만큼 칠하기
            paint = section[i] + m; // 새롭게 칠한 마지막 위치 갱신
            answer++;
        }
        return answer;
    }
}