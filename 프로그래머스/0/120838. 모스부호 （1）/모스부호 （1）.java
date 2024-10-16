class Solution {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", 
        		"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
        		"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        // split("") 메서드는 문자열을 분할하여 문자열 배열 형태로 반환
        // letter의 모스부호는 공백으로 나누어져 있음
        String[] str = letter.split(" ");
        String answer = "";
        
        for (String alphabet : str) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(alphabet)) {
                    // morse와 letter가 일치하는 인덱스 + 아스키 코드 더하기
                    answer += Character.toString(i + 97);
                }
            }
        }
        
        return answer;
    }
}