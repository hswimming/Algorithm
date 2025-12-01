import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        // 돗자리 크기 오름차순 정렬
        Arrays.sort(mats);
        
        // 큰 돗자리부터 확인
        for (int i = mats.length - 1; 0 <= i; i--) {
            // 깔 수 있는 자리가 있는지 확인
            if (checkPlace(mats[i], park)) {
                return mats[i];
            }
        }
        
        return answer = -1;
    }
    
    // 돗자리를 깔 수 있는 위치 확인
    private boolean checkPlace(int size, String[][] park) {
        // 공원 세로, 가로 길이 (park[세로 인덱스][가로 인덱스])
        int h = park.length;
        int w = park[0].length;
        
        // 돗자리 왼쪽 위 모서리 (y, x)
        for (int i = 0; i <= h - size; i++) {
            for (int j = 0; j <= w - size; j++) {
                boolean check = true;
                
                // (y, x)부터 size * size 영역이 전부 -1인지 확인
                for (int y = 0; y < size && check; y++) { // false = 아래 행 패스
                    for (int x = 0; x < size; x++) {
                        if (!park[i + y][j + x].equals("-1")) {
                            check = false; // 한 칸이라도 사람이 있으면 불가능
                            break;
                        }
                    }
                }
                if (check) return true;
            }
        }
        // 전달받은 size 크기는 돗자리를 깔 수 없음
        return false;
    }
}