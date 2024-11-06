function solution(keyinput, board) {
    // up [0, 1] down [0, -1] left [-1, 0] right [1, 0]
    
    
    // 맵의 크기에 따라 이동할 칸이 초과하지 않는지 확인
    // 소수점 버려야 비교 가능
    var x = Math.floor(board[0] / 2);
    var y = Math.floor(board[1] / 2);
    var answer = [0, 0];
    
    // 입력한 방향키의 배열 요소와 같은 문자에 따라 좌표 이동
    // Math.abs() 사용 시 down, left 음수 이동이 제한됨
    for (let i = 0; i < keyinput.length; i++) {
        if (keyinput[i] === "up" && answer[1] < y) {
            answer[1]++;
        } else if (keyinput[i] === "down" && -y < answer[1]) {
            answer[1]--;
        } else if (keyinput[i] === "left" && -x < answer[0]) {
            answer[0]--;
        } else if (keyinput[i] === "right" && answer[0] < x) {
            answer[0]++;
        }
    }
    
    return answer;
}