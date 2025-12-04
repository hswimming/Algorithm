import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // id_list 순서대로 메일 개수 리턴
        int[] answer = new int[id_list.length];
        
        // 중복 신고 제거 (report 배열 중복 없애기)
        Set<String> set = new HashSet<>(Arrays.asList(report));
        
        // 신고당한 유저 기준으로 누가 신고했는지를 알아야 정지 대상인지 알 수 있음
        HashMap<String, Set<String>> map = new HashMap<>();
        
        // 신고한 유저 기준으로 자기가 신고한 유저 중 정지된 유저가 몇 명인지 확인해야 메일 개수를 알 수 있음
        HashMap<String, Set<String>> reportMap = new HashMap<>();
        
        // 모든 유저를 key로 미리 넣어두기 (나중에 get() 했을 때 null 방지)
        for (String id : id_list) {
            map.put(id, new HashSet<String>());
            reportMap.put(id, new HashSet<String>());
        }
        
        for (String s : set) {
            String[] str = s.split(" ");
            
            String from = str[0]; // 신고자
            String to = str[1]; // 신고당한 유저
            
            // 신고당한 유저 → 누가 신고했는지
            map.get(to).add(from);
            // 신고자 → 누구를 신고했는지
            reportMap.get(from).add(to);
        }
        
        // k번 이상 신고된 유저 리스트
        Set<String> banUser = new HashSet<>();
        
        for (String id : id_list) {
            // 신고당한 횟수 확인
            if (k <= map.get(id).size()) {
                banUser.add(id);
            }
        }
        
        // id_list 순서대로 메일 발송 수 계산
        for (int i = 0; i < id_list.length; i++) {
            int mail = 0;
            
            // 유저가 신고한 리스트에서 정지된 사람 카운트
            for (String ban : reportMap.get(id_list[i])) {
                if (banUser.contains(ban)) mail++;
            }
            answer[i] = mail;
        }
        
        return answer;
    }
}