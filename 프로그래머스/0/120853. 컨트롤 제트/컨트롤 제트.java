class Solution {
    public int solution(String s) {
        // 공백으로 구분된 문자열 자르기
        // split() => 지정한 구분자로 문자열을 나눠 배열에 저장
        String[] str = s.split(" ");
        int answer = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("Z")) {
                // 문자열 배열이 반환되므로 숫자로 변환해서 연산
                answer += Integer.parseInt(str[i]);
            } else {
                // 'Z' 나오면 전에 더했던 숫자 빼기
                answer -= Integer.parseInt(str[i - 1]);
            }
        }
        
        return answer;
    }
}