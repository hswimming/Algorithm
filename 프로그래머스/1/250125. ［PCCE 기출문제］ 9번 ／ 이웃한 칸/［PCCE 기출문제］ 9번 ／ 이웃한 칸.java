class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int count = 0; // 같은 색으로 색칠된 칸의 개수
        int[] dh = {0, 1, -1, 0}; // h 변화량
        int[] dw = {1, 0, 0, -1}; // w 변화량
        
        for (int i = 0; i <= 3; i++) {
            int h_check = h + dh[i]; // 체크할 칸의 h 좌표
            int w_check = w + dw[i]; // 체크할 칸의 w 좌표
            
            if ((0 <= h_check && h_check < n) && (0 <= w_check && w_check < n)) {
                // 고른 칸의 위치와 이웃한 칸들 중 같은 색으로 색칠된 칸 확인
                count += (board[h][w].equals(board[h_check][w_check])) ? 1 : 0;
            }
        }
        System.out.println("count: " + count);
        
        return answer = count;
    }
}