function solution(board) {
    // 2차원 배열의 모든 요소를 확인하려면 배열의 각 행과 각 요소에 every 중첩
    // row => 각 행이 조건을 만족하는지 확인, cell => 각 row 내부의 모든 cell 확인
    var result = board.every(row => row.every(cell => cell === 1));
    var answer = 0;
    
    if (result) {
        // 모든 요소가 1 => 안전지역 없음, 0 리턴
        answer = 0;
    } else {
        var leng = board.length; // board는 n * n 배열
        
        // 길이가 n인 배열 생성 후 전체 요소를 0으로 초기화
        // Array.from을 사용하여 n x n 크기의 2차원 배열 생성
        var danger = Array.from({length: leng}, () => Array(leng).fill(0));
        
        // 폭탄 위치 찾기
        for (let i = 0; i < leng; i++) { // 현재 행
            for (let j = 0; j < leng; j++) { // 현재 열
                if (board[i][j] === 1) { // 폭탄 위치
                    danger[i][j] = 1; // 폭탄 위치 복사
                    
                    // 폭탄 주변 8칸 위험지역 확인 => 3칸씩 표시
                    for (let row = -1; row <= 1; row++) { // 행 방향 (-1, 0, 1)
                        for (let cell = -1; cell <= 1; cell++) { // 열 방향 (-1, 0, 1)
                            var x = i + row; // 폭탄 위치 i에서 row만큼 이동한 행
                            var y = j + cell; // 폭탄 위치 j에서 cell만큼 이동한 열
                            
                            // 배열 범위를 벗어나지 않도록 확인
                            if (0 <= x && x < leng && 0 <= y && y < leng) {
                                danger[x][y] = 1; // 위험지역 표시
                            }
                        }
                    }
                }
            }
        }
        
        // 위험지역이 표시된 danger 배열에서 안전지역 확인
        for (let i = 0; i < leng; i++) { // 행
            for (let j = 0; j < leng; j++) { // 열
                if (danger[i][j] === 0) {
                    answer++; // 안전지역이면 증가
                }
            }
        }
    }
    
    return answer;
}