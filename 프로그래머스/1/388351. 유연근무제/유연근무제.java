class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        // 1: 월요일, 2: 화요일, 3: 수요일, 4: 목요일, 5: 금요일, 6: 토요일, 7: 일요일
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int day = startday; // 직원마다 확인해야 하므로 요일 초기화
            int count = 0; // 설정 출근 시각에 출근한 홧수 (평일)
            
            for (int j = 0; j < 7; j++) {
                // 평일 출근만 확인
                if (day != 6 && day != 7) {
                    // ex: 8시 55분의 10분 뒤는 9시로 넘어가므로 이런 경우의 수 포함 계산
                    int time = schedules[i];
                    int h = time / 100; // 시 구하기
                    int m = time % 100; // 분 구하기
                    
                    m += 10; // 출근 희망 시각 + 10분까지 허용
                    
                    // 더한값이 60분을 넘으면 시간 올려주기
                    if (60 <= m) {
                        h++;
                        m -= 60;
                    }
                    
                    // 현재 문제에서 사용하는 시간 형태로 변환
                    int limit = h * 100 + m;
                    
                    if (timelogs[i][j] <= limit) count++;
                }
                day++;
                
                if (day == 8) day = 1; // 월요일로 초기화
            }
            if (count == 5) answer++;
        }
        
        return answer;
    }
}