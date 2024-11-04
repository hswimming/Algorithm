class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"}; // 가능한 발음 배열
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < baby.length; j++) {
                // replace() => 특정 문자열을 새로운 문자열로 대체
                // replaceAll() => 정규식에 일치하는 문자열들을 전부 다른 문자열로 대체
                // 발음 배열과 동일한 문자열이 있으면 공백으로 변경
                babbling[i] = babbling[i].replace(baby[j], " ");
            }
            
            // 변경한 공백을 빈 문자열로 변환 후 아무것도 남지 않으면 answer 증가
            // 빈 문자열 => 발음 배열과 동일한 문자열
            if (babbling[i].replaceAll(" ", "").equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}