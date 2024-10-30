import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        // 정규 표현식 패턴 컴파일
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        
        // String.split("") => 문자열을 한 글자씩 나눔
        // 나눈 문자를 정규 표현식과 일치하는지 확인
        // 패턴과 일치하지 않는 문자들만 필터링해서 배열 생성
        String[] str = Stream.of(my_string.split(""))
            .filter(s -> !pattern.matcher(s).matches())
            .toArray(String[]::new);
        
        int[] answer = new int[str.length];
        
        // 문자열 배열 => 숫자 배열 변환
        for (int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(answer); // 오름차순 정렬
        
        return answer;
    }
}