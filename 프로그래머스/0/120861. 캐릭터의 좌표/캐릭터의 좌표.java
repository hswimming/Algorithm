class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // up [0, 1] down [0, -1] left [-1, 0] right [1, 0]
        
        int[] answer = new int[board.length];
        
        // 맵의 크기에 따라 이동할 칸이 초과하지 않는지 확인
        int x = board[0] / 2;
        int y = board[1] / 2;
        
        // 입력한 방향키의 배열 요소와 같은 문자에 따라 좌표 이동
        // down, left 경우 음수가 될 수 있으므로 절대값 반환 후 비교
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                answer[1]++; // [0, 1]
                answer[1] = (y < answer[1]) ? answer[1] - 1 : answer[1];
            }
            
            if (keyinput[i].equals("down")) {
                answer[1]--; // [0, -1]
                answer[1] = (y < Math.abs(answer[1])) ? answer[1] + 1 : answer[1];
            }
            
            if (keyinput[i].equals("left")) {
                answer[0]--; // [-1, 0]
                answer[0] = (x < Math.abs(answer[0])) ? answer[0] + 1 : answer[0];
            }
            
            if (keyinput[i].equals("right")) {
                answer[0]++; // [1, 0]
                answer[0] = (x < answer[0]) ? answer[0] - 1 : answer[0];
            }
        }
        
        return answer;
    }
}