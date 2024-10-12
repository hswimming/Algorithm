import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // num2번째 앞까지 자르므로 + 1
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}