import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 가장 긴 변이 sides[1]인 경우 될 수 있는 나머지 한 변의 개수 = sides[0];
        // 나머지 한 변이 가장 긴 변인 경우 = (sides[1] + 1) < (sides[0] + sides[1])
        // return = (sides[1] + 1) < (sides[0] + sides[1]) 만족하는 수의 개수 + sides[0]
        
        Arrays.sort(sides); // 오름차순 정렬, sides의 길이는 2
        
        int max = sides[0] + sides[1]; // 가장 긴 변의 길이 < 다른 두 변의 길이의 합
        int num = max - (sides[1] + 1); // 나머지 한 변이 가장 긴 변인 경우 될 수 있는 한 변의 개수
        int answer = 0;
        
        /*
        1. a가 가장 긴 변의 경우 (c < a) 성립해야 하는 조건은 (a < b + c)
            즉, (a - b < c < a) c의 가능한 정수 개수는 b - 1개
        2. c가 가장 긴 변인 경우 (a < c) 성립해야 하는 조건은 (c < a + b)
            즉, (a < c < a + b) c의 가능한 정수 개수는 b개
        3. (a = c) 경우 b를 더해도 a = c라는 단 하나의 경우만 가능 => (2 * b - 1)
        */
        if (sides[0] == 1) {
            answer = 1;
        } else {
            answer = sides[0] + num;
        }
        
        return answer;
    }
}