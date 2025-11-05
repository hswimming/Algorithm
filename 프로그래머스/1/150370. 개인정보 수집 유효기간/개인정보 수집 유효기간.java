import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int totalDate = getDate(today); // 오늘 날짜를 일수로 바꿈
        
        for (int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            // terms 배열 [0]: 약관종류, [1]: 유효기간
            map.put(str[0], Integer.parseInt(str[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] prv = privacies[i].split(" ");
            
            int day = map.get(prv[1]); // 해당하는 약관의 유효기간
            // 수집 당일 날도 포함해서 파기 = 개인정보 수집 일자 + (유효기간 개월 * 28) - 1
            int calDate = getDate(prv[0]) + map.get(prv[1]) * 28 - 1;
            
            // 약관 유효기간 * 28일 = 개인정보 유효기간 일수
            if (calDate < totalDate) {
                answer.add(i + 1); // 시작번호 = 1번
            }
        }
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
    
    // 총 일수로 변환
    private int getDate(String today) {
        String[] date = today.split("\\."); // .을 기준으로 년, 월, 일 쪼개기
        
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        // 모든 달은 28일까지 있다고 가정함, 1년 => 12 * 28 = 336일
        return (year * 12 * 28) + (month * 28) + day;
    }
}