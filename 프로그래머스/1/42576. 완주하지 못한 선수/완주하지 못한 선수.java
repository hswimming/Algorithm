import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // HashMap에 이름(키)과 그 이름의 등장 횟수(값)를 갱신하면서 저장
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자 수 세기
        for (String p : participant) {
            // 키가 없으면 0 반환, 있으면 + 1 => 동명이인 처리
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // 완주자 수만큼 차감
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // 값이 1 이상 남아있는 사람(완주하지 못한 사람) 찾기
        for (String key : map.keySet()) {
            if (0 < map.get(key)) answer = key;
        }
        
        return answer;
    }
}