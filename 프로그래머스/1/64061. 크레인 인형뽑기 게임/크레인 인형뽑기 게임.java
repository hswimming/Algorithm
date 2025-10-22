import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // moves 배열의 번호는 N 크기의 정사각 격자의 열 번호 => 5 * 5 칸일 경우 크레인은 (1, 2, 3, 4, 5) 움직임
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            // 크레인을 작동시킨 위치에 해당하는 열을 찾고
            int col = moves[i] - 1; // 번호 - 1 => index
            int num = 0; // 바구니에 옮기려는 인형의 번호
            
            for (int j = 0; j < board.length; j++) {
                // 해당 열의 번호를 바구니로 옮기기
                if (board[j][col] != 0) {
                    num = board[j][col];
                    board[j][col] = 0; // 바구니로 옮겼다는 표시
                    break;
                }
            }
            // 옮길 번호가 없으면 넘어가기
            if (num == 0) continue;
            
            // 바구니에 담긴 마지막 번호와 지금 바구니에 옮긴 번호가 일치하면 바구니에서 제거, 카운트
            if (!st.isEmpty() && st.peek() == num) {
                st.pop();
                answer += 2; // 같은 인형이 터진다는건 같은 숫자의 인형이 2개라는 뜻
            } else {
                st.add(num);
            }
        }
        
        return answer;
    }
}