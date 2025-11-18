import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String call : callings) {
            int idx = map.get(call); // 현재 순위
            int frontIdx = idx - 1; // 앞 선수 순위
            String frontPlayer = players[frontIdx];
            
            // 순위 변경
            players[frontIdx] = call;
            players[idx] = frontPlayer;
            
            // 변경된 순위 저장
            map.put(call, frontIdx);
            map.put(frontPlayer, idx);
        }
        
        return answer = players;
    }
}