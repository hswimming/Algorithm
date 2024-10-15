class Solution {
    public int solution(int hp) {
        // 장군개미 공격력 5
        // 병정개미 공격력 3
        // 일개미 공격력 1
        
        int answer = 0;
        int warlordAnt = hp / 5; // 한 번에 나눠떨어지는 경우
        int soldierAnt = (hp % 5) / 3; // 5로 나눈 나머지를 나누기
        int ant = ((hp % 5) % 3) / 1; // 5와 3의 나머지를 나누기
        
        return answer = warlordAnt + soldierAnt + ant;
    }
}