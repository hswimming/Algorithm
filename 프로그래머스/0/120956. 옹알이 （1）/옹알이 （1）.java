class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"}; // 가능한 발음 배열
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < baby.length; j++) {
                // 발음 배열과 동일한 문자열이 있으면 공백으로 변경
                babbling[i] = babbling[i].replaceAll(baby[j], " ");
            }
            
            // 변경한 공백을 없애고 아무것도 남지 않으면 answer 증가
            if (babbling[i].replaceAll(" ", "").equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}