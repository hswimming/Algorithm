import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 가로(W): park[0].length
        // 세로(H): park.length
        int[] answer = {};
        
        // 시작 지점 좌표
        int r = 0;
        int c = 0;
        
        // 동서남북 좌표
        HashMap<String , int[]> map = new HashMap<>();
        map.put("E", new int[] {0, 1});
        map.put("W", new int[] {0, -1});
        map.put("S", new int[] {1, 0});
        map.put("N", new int[] {-1, 0});
        
        // 시작 지점 S 좌표 확인
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                }
            }
        }
        
        for (String route : routes) {
            String[] str = route.split(" ");
            String location = str[0]; // 방향
            int dist = Integer.parseInt(str[1]); // 이동할 칸 수
            
            int[] l = map.get(location);
            
            // 이동 도중 실패하면 이전 좌표로 돌아가기 위해
            int nr = r;
            int nc = c;
            boolean check = true;
            
            // 좌표 확인
            for (int k = 0; k < dist; k++) {
                nr += l[0];
                nc += l[1];
                
                // 주어진 방향으로 이동할 때 공원을 벗어나는지 확인
                if (nr < 0 || nc < 0 || nr >= park.length || nc >= park[0].length()) {
                    check = false;
                    break;
                }
                // 주어진 방향으로 이동 중 장애물을 만나는지 확인
                if (park[nr].charAt(nc) == 'X') {
                    check = false;
                    break;
                }
            }
            // 좌표 이동 성공 시 갱신
            if (check) {
                r = nr;
                c = nc;
            }
        }
        
        return answer = new int[] {r, c};
    }
}