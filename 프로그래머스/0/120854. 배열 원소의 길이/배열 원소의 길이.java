import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        
        // strlist 배열의 i번째 문자열 길이를 리스트에 추가
        for (int i = 0; i < strlist.length; i++) {
            list.add(strlist[i].length());
        }
        
        // 리스트 => 배열
        return answer = list.stream().mapToInt(i -> i).toArray();
    }
}