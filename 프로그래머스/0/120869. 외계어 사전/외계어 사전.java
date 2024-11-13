import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell 정렬 후 문자열 배열 => 문자열로 변환 (나눠서 할 경우)
        // Arrays.sort(spell);
        // String str = String.join("", spell);
        
        // spell 정렬 후 문자열 배열 => 문자열로 변환 (한번에 할 경우)
        // stream을 이용하여 정렬 후 입력 요소를 단일 문자열로 연결
        // Collector 클래스 => Stream에서 수행한 연산 결과를 수집하여 다양한 형태의 컬렉션을 반환
        String reg = Arrays.stream(spell).sorted().collect(Collectors.joining(""));
        int answer = 0;
        
        for (int i = 0; i < dic.length; i++) {
            // dic 배열의 문자열 요소를 한 글자씩 나눈 배열 반환
            String[] str =dic[i].split("");
            // 정렬한 후 문자열로 연결
            String s = Arrays.stream(str).sorted().collect(Collectors.joining(""));
            
            // 일치하는 문자가 있으면 종료
            if (s.equals(reg)) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        
        return answer;
    }
}