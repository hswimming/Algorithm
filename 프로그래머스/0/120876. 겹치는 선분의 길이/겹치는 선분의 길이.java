class Solution {
    public int solution(int[][] lines) {
        // lines 길이 = 3, lines 원소의 길이 = 2
        int answer = 0;
        int[] a = lines[0];
        int[] b = lines[1];
        int[] c = lines[2];
        
        // 두 선분의 겹치는 구간 계산 (겹치지 않을 경우 음수)
        // 시작점: 가장 큰 값, 끝점: 가장 작은 값
        int ab = Math.max(0, Math.min(a[1], b[1]) - Math.max(a[0], b[0]));
        int bc = Math.max(0, Math.min(b[1], c[1]) - Math.max(b[0], c[0]));
        int ca = Math.max(0, Math.min(c[1], a[1]) - Math.max(c[0], a[0]));
        
        // 모두 겹치는 구간의 길이 계산
        // 세 선분의 끝점 최소값 - 시작점 최대값
        int start = Math.max(a[0], Math.max(b[0], c[0]));
        int end = Math.min(a[1], Math.min(b[1], c[1]));
        int abc = Math.max(0, end - start);
        
        // 2개씩 겹치는 부분 제외
        return answer = ab + bc + ca - (2 * abc);
    }
}