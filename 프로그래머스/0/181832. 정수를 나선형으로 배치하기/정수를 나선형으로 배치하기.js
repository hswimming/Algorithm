function solution(n) {
    /*
        방향      X축      Y축
         →        0        1
         ↓        1        0
         ←        0       -1
         ↑       -1        0
    */
    // 길이가 n인 2차원 배열 각 행 0으로 채우기
    const answer = Array.from({ length: n }, () => Array(n).fill(0));
    
    // 현재 위치 (배열 시작 위치)
    let x = 0;
    let y = 0;
    
    // 현재 이동 방향
    let num = 0; // 0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위
    
    const arrX = [0, 1, 0, -1]; // 행
    const arrY = [1, 0, -1, 0]; // 열
    
    for (let i = 1; i <= n * n; i++) {
        // 현재 위치에 값 저장
        answer[x][y] = i;
        
        // 다음 위치 계산
        let nextX = x + arrX[num];
        let nextY = y + arrY[num];
        
        // 배열 범위를 벗어나거나 숫자가 채워진 곳이면 방향 바꾸기
        if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n || answer[nextX][nextY] != 0) {
            // 방향 변경
            num = (num + 1) % 4;
            
            // 방향 변경 후 다음 위치 계산
            nextX = x + arrX[num];
            nextY = y + arrY[num];
        }
        // 현재 위치에서 다음 위치로 이동
        x = nextX;
        y = nextY;
    }
    
    
    return answer;
}