import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();
        
        // 0, 1은 소수에 포함 X, 제한사항에 n은 2이상의 수
        for (int i = 2; i <= n; i++) {
            // n이 나누어떨어지지 않을 때까지 소인수로 계속 나눔
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        
        // 중복 제거 후 정렬
        return answer = list.stream().distinct().mapToInt(i -> i).toArray();
    }
}