import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        // 공격 시간을 기준으로 오름차순 정렬됨. 마지막 값 = 마지막 공격 시간
        int time = attacks[attacks.length - 1][0];
        int count = 0; // 연속 성공 횟수
        int maxHealth = health; // 최대 체력
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // 공격 시간 별 피해량 저장
        for (int[] attack : attacks) {
            map.put(attack[0], attack[1]);
        }
        
        for (int t = 0; t <= time; t++) {
            // 붕대 감기 전 공격 받는지 먼저 확인
            if (map.containsKey(t)) {
                int damage = map.get(t);
                health -= damage;
                
                // 체력이 0 이하가 되어 죽음
                if (health <= 0) return -1;
                
                count = 0;
                continue;
            }
            
            health += bandage[1];
            count++;
            
            // 기술의 시전 시간 만족하면 추가 회복
            if (count == bandage[0]) {
                health += bandage[2];
                count = 0;
            }
            
            // 현재 체력이 최대 체력보다 커지는 것은 불가능
            if (maxHealth < health) health = maxHealth;
        }
        
        return answer = health;
    }
}