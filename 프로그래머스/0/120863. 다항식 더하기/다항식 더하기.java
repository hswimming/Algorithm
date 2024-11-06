class Solution {
    public String solution(String polynomial) {
        // 항과 연산기호 사이에는 항상 공백이 존재하므로 공백을 기준으로 분리
        String[] str = polynomial.split(" ");
        // 하나 이상의 숫자, \\d는 숫자 0부터 9를 의미
        // +는 하나 이상의 반복 즉, 한 자리 이상의 숫자가 연속해서 나타나는지 확인
        String pattern = "\\d+";
        int linear = 0; // 일차항 더한 값
        int quadratic = 0; // 상수항 더한 값
        String answer = "";
        
        for (int i = 0; i < str.length; i++) {
            // 자른 문자열 배열 요소에 x가 포함된 문자열 찾기
            if (str[i].contains("x")) {
                // x 앞의 숫자 연산을 위해 치환
                String s = str[i].replace("x", "");
                // x 앞에 숫자가 없으면 1로 간주, 있으면 형 변환 후 연산
                linear += s.isEmpty() ? 1 : Integer.parseInt(s);
            } else if (str[i].matches(pattern) == true) {
                // 숫자인지 확인하는 정규 표현식을 만족하면 연산
                quadratic += Integer.parseInt(str[i]);
            }
        }
        
        // 일차항 더한 값이 1이면 숫자 없이 x 반환
        if (linear != 0) {
            answer += (linear == 1 ? "x" : linear + "x");
        }
        
        // 숫자항이 존재하면 일차항 + 숫자항 합친 문자열 반환
        if (quadratic != 0) {
            answer += (linear != 0 ? " + " : "") + quadratic;
        }
        
        return answer;
    }
}