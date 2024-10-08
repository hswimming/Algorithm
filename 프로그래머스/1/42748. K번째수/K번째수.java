import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 자르는 점 시작
            int end = commands[i][1]; // 자르는 점 끝
            int num = commands[i][2]; // 찾는 수의 인덱스
            
            // Arrays.copyOfRange 메소드의 두번째 매개변수는 복사를 시작할 범위
            // 지정한 숫자(순서)의 다음 원소부터 복사 시작
            // => 시작점부터 잘라야하기 때문에 - 1
            int[] arr = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(arr); // 자른 후 정렬
            
            // 찾으려는 수는 순서임, 배열은 인덱스 0부터 시작하므로 순서 - 1
            answer[i] = arr[num - 1];
        }
        
        return answer;
    }
}