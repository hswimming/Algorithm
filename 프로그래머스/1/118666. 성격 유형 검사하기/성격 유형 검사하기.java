import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<Character, Integer> map = calculateScore(survey, choices);
        answer = personalType(map);
        
        return answer;
    }
    
    // 점수 누적 처리
    private Map<Character, Integer> calculateScore(String[] survey, int[] choices) {
        int[] score = {3, 2, 1, 0, 1, 2, 3}; // 선택지 점수
        HashMap<Character, Integer> map = new HashMap<>();
        
        // 판단 지표 수 = 선택 질문 수
        for (int i = 0; i < choices.length; i++) {
            int scoreIdx = score[choices[i] - 1]; // 선택한 선택지 점수 인덱스
            char ch1 = survey[i].charAt(0); // 질문의 첫 번째 지표
            char ch2 = survey[i].charAt(1); // 질문의 두 번째 지표
            
            if (choices[i] < 4) { // 비동의 범위 (1 ~ 3)
                map.put(ch1, map.getOrDefault(ch1, 0) + scoreIdx);
            } else if (choices[i] > 4) { // 동의 범위 (5 ~ 7)
                map.put(ch2, map.getOrDefault(ch2, 0) + scoreIdx);
            }
        }
        return map;
    }
    
    // 최종 성격 유형 조합
    private String personalType(Map<Character, Integer> map) {
        String[] type = {"RT", "CF", "JM", "AN"}; // 성격 지표
        StringBuilder sb = new StringBuilder();
        
        for (String t : type) {
            char ch1 = t.charAt(0); // 지표 별 성격 유형 첫번째 글자
            char ch2 = t.charAt(1); // 지표 별 성격 유형 두번째 글자
            
            int score1 = map.getOrDefault(ch1, 0); // 지표 별 첫번째 글자 점수
            int score2 = map.getOrDefault(ch2, 0); // 지표 별 두번째 글자 점수
            
            if (score2 < score1) {
                sb.append(ch1);
            } else if (score1 < score2) {
                sb.append(ch2);
            } else {
                sb.append(ch1 <= ch2 ? ch1 : ch2); // 점수가 같으면 사전 순으로 빠른 값
            }
        }
        return sb.toString();
    }
}