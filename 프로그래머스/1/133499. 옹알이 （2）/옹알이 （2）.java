class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] reg = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String prev = "";
            String temp = babbling[i];
            
            // 같은 발음이 2번 연속되는지 확인
            for (int j = 0; j < reg.length; j++) {
                if (temp.contains(reg[j] + reg[j])) {
                    // 연속된 발음이 있으면 종료
                    prev = null;
                    break;
                }
            }
            
            if (prev != null) {
                // 정규 표현식에 일치하면 빈 문자열로 치환
                String str = temp.replaceAll("aya|ye|woo|ma", "");
                
                if (str.equals("")) answer++;
            }
        }
        return answer;
    }
}