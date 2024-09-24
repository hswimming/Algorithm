class Solution {
    public int solution(int slice, int n) { // 피자 조각 수, 피자를 먹는 사람의 수
        int answer = 0;
        int pizza = n / slice; // 최소 몇 판이 필요한지 알기 위해
        
        if (n % slice == 0) {
            answer = pizza;
        } else {
            // 나머지가 0이 아닐 경우 사람의 수가 더 많으므로 피자를 추가
            answer = pizza + 1;
        }
        
        return answer;
    }
}