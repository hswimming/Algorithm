import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율은 내림차순 정렬, 스테이지 번호는 오름차순 정렬
        // N = 전체 스테이지 개수
        // 배열의 길이 = 맨 처음 스테이지 도전한 사람의 총 수
        // 다음 스테이지로 넘어가려면 실패한 명수 빼기
        // ex) 1번 스테이지 총 8명 중에서 1명 실패 => 2번 스테이지 총 7명
        // 모든 사용자가 마지막 스테이지에 있으면 실패율 + 1, 나머지 스테이지의 실패율은 0
        
        int[] answer;
        Map<Integer, Double> map = new HashMap<>(); // 스테이지 번호, 실패율
        int person = stages.length; // 스테이지에 도전한 사람의 수
        
        for (int i = 1; i <= N; i++) {
            int fail = 0; // 실패한 사람의 수
            double percent = 0; // 실패율
            
            for (int j = 0; j < stages.length; j++) {
                // 실패한 사람의 수
                if (i == stages[j]) {
                    fail++;
                }
            }
            
            // 실패율
            percent = (person > 0) ? (double) fail / person : 0;
            
            // 정렬하기 위해 스테이지 번호(키), 실패율(값) 담기
            map.put(i, percent);
            
            // 실패한 사람을 제외한 다음 스테이지 사람의 수
            person -= fail;
        }
        
        // 정렬한 스테이지 번호를 담을 배열
        List<Integer> arr = new ArrayList<>(map.keySet());
        
        Collections.sort(arr, (o1, o2) -> {
            if (map.get(o2) == map.get(o1)) {
                // 실패율이 같으면 스테이지 번호 오름차순
                return Integer.compare(o1, o2);
            } else {
                // 내림차순
                return Double.compare(map.get(o2), map.get(o1));
            }
        });
        
        // 리스트를 배열로 변환하여 반환
        return answer = arr.stream().mapToInt(i -> i).toArray();
    }
}