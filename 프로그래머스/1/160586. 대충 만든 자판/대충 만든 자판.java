import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        // key: 문자, value: 키 입력 횟수
        Map<Character, Integer> map = new HashMap<>();
        
        // keymap
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                // key에 현재 문자 저장
                char key = s.charAt(i);
                // key가 존재할 경우 현재 저장된 값, 없는 경우 i + 1
                int value = map.getOrDefault(key, i + 1);
                
                // value와 i + 1 중 작은 값으로 key 값 저장
                map.put(key, Math.min(value, i + 1));
            }
        }
        
        // targets
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                // key에 현재 문자 저장
                char key = targets[i].charAt(j);
                
                if (map.containsKey(key)) {
                    // key가 존재할 경우 answer에 value 저장
                    answer[i] += map.get(key);
                } else {
                    // key가 존재하지 않을 경우 -1 저장
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}