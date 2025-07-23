import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        // 숫자(1~2자리), 보너스(S|D|T), 옵션(* or # 있을수도 없을수도)
        Pattern pattern = Pattern.compile("(\\d{1,2})([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);
        
        int[] scores = new int[3];
        int idx = 0;
        
        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);
            
            // 보너스 처리
            if (bonus.equals("D")) {
                score = (int) Math.pow(score, 2);
            } else if (bonus.equals("T")) {
                score = (int) Math.pow(score, 3);
            }
            
            // 옵션 처리
            if (option.equals("*")) {
                score *= 2;
                // 첫 번째 기회 이상이면 이전 점수도 2배
                if (0 < idx) scores[idx - 1] *= 2;
            } else if (option.equals("#")) {
                score *= -1;
            }
            scores[idx++] = score;
        }
        // 총합
        for (int s : scores) answer += s;
        
        return answer;
    }
}