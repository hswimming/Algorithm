import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 가장 긴 변이 sides[1]인 경우 될 수 있는 나머지 한 변의 개수 = sides[0];
        // 나머지 한 변이 가장 긴 변인 경우 = (sides[1] + 1) < (sides[0] + sides[1])
        // return = (sides[1] + 1) < (sides[0] + sides[1]) 만족하는 수의 개수 + sides[0]
        
        Arrays.sort(sides); // 오름차순 정렬, sides의 길이는 2
        
        int max = sides[0] + sides[1]; // 가장 긴 변의 길이 < 다른 두 변의 길이의 합
        int num = max - (sides[1] + 1); // 나머지 한 변이 가장 긴 변인 경우될 수 있는 한 변의 개수
        int answer = 0;
        
        if (sides[1] == 2) {
            // 두 변이 1, 2 인 경우
            answer = 1;
        } else {
            answer = sides[0] + num;
        }
        
        return answer;
    }
}