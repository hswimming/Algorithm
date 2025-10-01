import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 전체 학생 수 - 체육복을 도난당한 학생 수 = 체육복을 도난당하지 않은 학생 수
        int answer = n - lost.length;
        
        // 정렬해야 앞 번호를 우선으로 빌려줄 수 있음
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복이 있지만 도난당한 학생 수
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 체육복을 도난당한 학생과 여벌 체육복을 가진 학생이 일치하는지 확인
                if (lost[i] == reserve[j]) {
                    answer++;
                    
                    // 일치하면 다른 학생에게 체육복을 빌려줄 수 없음
                    // => 다시 처리하지 않도록 존재할 수 없는 값으로 변경
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        // 여벌 체육복이 있는 학생이 빌려줄 수 있는 학생 수
        // 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있음 [-1, 0, 1]
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    
                    // 여벌 체육복을 빌려주고/빌리면 처리되지 않도록 변경
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}