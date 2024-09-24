class Solution {
    public int solution(int slice, int n) { // 피자 조각 수, 피자를 먹는 사람의 수
        int answer = 0;
        int pizza = n / slice; // 최소 몇 판이 필요한지 알기 위해
        
        if (n % slice == 0) {
            answer = pizza;
        } else {
            answer = pizza + 1;
        }
        
        return answer;
    }
}