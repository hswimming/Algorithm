import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arr = new ArrayList<Integer>();
        int num = 0;
        
        for (int i  = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num = numbers[i] + numbers[j]; // 다음 인덱스와 더하기
                arr.add(num);
            }
        }
        
        // 중복제거
        arr = arr.stream().distinct().collect(Collectors.toList());
        
        int[] answer = new int[arr.size()];
        
        // 리스트 -> 배열
        for (int j = 0; j < arr.size(); j++) {
            answer[j] = arr.get(j);
        }
        
        Arrays.sort(answer); // 오름차순 정렬
        return answer;
    }
}