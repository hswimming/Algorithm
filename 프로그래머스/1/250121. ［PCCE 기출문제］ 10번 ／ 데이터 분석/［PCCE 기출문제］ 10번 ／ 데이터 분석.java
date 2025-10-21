import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 스트림 안에 사용된 변수는 람다 내부에서 캡처되므로 final 또는 effectively final(사실상 상수)이어야 함
        // 스트림 사용 전 final 선언 또 해줘야 됨... switch로 인덱스 결정하는걸로
        
        // ext 문자열과 일치하는 index
        int extIdx = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> -1;
        };
        
        // sort_by 문자열과 일치하는 index
        int sortIdx = switch (sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> -1;
        };
        
        // val_ext 보다 작은 값 필터, sort_by 값을 기준으로 오름차순 정렬
        int[][] answer = Arrays.stream(data)
            .filter(row -> row[extIdx] < val_ext)
            .sorted((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]))
            .toArray(int[][]::new);
        
        return answer;
    }
}