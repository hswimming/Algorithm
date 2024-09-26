class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(500000 <= price) {
            // 50만 원 이상 사면 20%
            answer = (int) (price - (price * 0.2));
        } else if (300000 <= price && price < 500000) {
            // 30만 원 이상 사면 10%
            answer = (int) (price - (price * 0.1));
        } else if (100000 <= price && price < 300000) {
            // 10만 원 이상 사면 0.05%
            answer = (int) (price - (price * 0.05));
        } else {
            // 조건을 만족하지 않음
            answer = price;
        }
        
        return answer; // 소수점 버리기
    }
}