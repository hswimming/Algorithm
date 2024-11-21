class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] danger = new int[board.length][board.length]; // board는 n * n 배열
        
        // 폭탄 위치 찾기
        for (int i = 0; i < danger.length; i++) { // 현재 행
            for (int j = 0; j < danger.length; j++) { // 현재 열
                if (board[i][j] == 1) { // 폭탄 위치
                    danger[i][j] = 1; // 폭탄 위치 복사
                    
                    // 폭탄 주변 8칸 위험지역 확인 => 3칸씩 표시
                    for (int row = -1; row <= 1; row++) { // 행 방향 (-1, 0, 1)
                        for (int cell = -1; cell <= 1; cell++) { // 열 방향 (-1, 0, 1)
                            int x = i + row; // 폭탄 위치 i에서 row만큼 이동한 행
                            int y = j + cell; // 폭탄 위치 j에서 cell만큼 이동한 열
                            
                            // 배열 범위를 벗어나지 않도록 확인
                            if (0 <= x && x < danger.length && 0 <= y && y < danger.length) {
                                danger[x][y] = 1; // 위험지역 표시
                            }
                        }
                    }
                }
            }
        }
        
        // 위험지역이 표시된 danger 배열에서 안전지역 확인
        for (int i = 0; i < danger.length; i++) { // 행
            for (int j = 0; j < danger.length; j++) { // 열
                if (danger[i][j] == 0) {
                    answer++; // 안전지역이면 증가
                }
            }
        }
        
        return answer;
    }
}