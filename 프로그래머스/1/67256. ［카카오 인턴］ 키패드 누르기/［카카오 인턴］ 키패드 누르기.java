import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        HashMap<Integer, int[]> map = new HashMap<>();
        int[][] phone = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -1}}; // 전화 키패드 좌표
        int[] left = {3, 0}; // 왼손 시작 위치 (*) 
        int[] right = {3, 2}; // 오른손 시작 위치 (#)
        
        // 전화 키패드 숫자 좌표 저장
        for (int i = 0; i < phone.length; i++) {
            for (int j = 0; j < phone[i].length; j++) {
                if (phone[i][j] != -1) { // -1 => (*, #) 처리
                    map.put(phone[i][j], new int[] {i, j});
                }
            }
        }
        
        for (int num : numbers) {
            int[] target = map.get(num);
            // map에 저장한 값 => 1: {0, 0}
            // 좌표의 열에 해당하는 값 = 전화 키패드 열 (왼쪽, 가운데, 오른쪽)
            int col = target[1];
            
            if (col == 0) {
                // 전화 키패드 왼쪽 열
                answer += "L";
                left = target; // 해당 좌표로 왼손 이동
            } else if (col == 2) {
                // 전화 키패드 오른쪽 열
                answer += "R";
                right = target; // 해당 좌표로 오른손 이동
            } else {
                /*
                 * 왼손 [i][j] - 누를 2580 좌표 [i][j] = 나온 좌표 i + j
                 * 오른손 [i][j] - 누를 2580 좌표 [i][j] = 나온 좌표 i + j
                 * 좌표를 더한 값이 작은쪽 = 가운데 좌표와 가까운곳
                 */
                int leftNum = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
                int rightNum = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);
                
                if (leftNum < rightNum) {
                    answer += "L";
                    left = target;
                } else if (rightNum < leftNum) {
                    answer += "R";
                    right = target;
                } else {
                    // 두 엄지손가락의 거리가 같다면 사용하는 손으로
                    if (hand.equals("left")) {
                        answer += "L";
                        left = target;
                    } else {
                        answer += "R";
                        right = target;
                    }
                }
            }
        }
        
        return answer;
    }
}