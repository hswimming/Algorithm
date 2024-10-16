class Solution {
    public String solution(String rsp) {
        // split("") 메서드는 문자열을 분할하여 문자열 배열 형태로 반환
        String[] str = rsp.split("");
        String answer = "";
        
        for (int i = 0; i < rsp.length(); i++) {
            // 문자 포함 여부에 따라 이기는 경우 리턴
            if (str[i].equals("0")) {
                answer += "5";
            } else if (str[i].equals("2")) {
                answer += "0";
            } else {
                answer += "2";
            }
        }
        
        return answer;
    }
}