import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<Integer>();
        
        if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                list.add(numbers[i - 1]); // i가 0부터 시작하면 3이 한 번 더 들어감
            }
            // 중간 삽입: List.add(index, value); => 중간에 넣을 인덱스(배열 인덱스), value: 중간에 넣을 값
            list.add(0, numbers[numbers.length - 1]); // 마지막 인덱스 값이 맨 앞으로
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                list.add(numbers[i + 1]);
            }
            // 중간 삽입: List.add(index, value); => 중간에 넣을 인덱스(배열 인덱스), value: 중간에 넣을 값
            list.add(numbers.length - 1, numbers[0]); // 0번째 인덱스 값이 마지막으로
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}