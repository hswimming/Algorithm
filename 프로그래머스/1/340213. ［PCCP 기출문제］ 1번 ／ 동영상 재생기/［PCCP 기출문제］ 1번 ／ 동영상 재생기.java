class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video = toSecond(video_len); // 영상 길이
        int now = toSecond(pos); // 현재 위치
        int opStart = toSecond(op_start); // 오프닝 시작
        int opEnd = toSecond(op_end); // 오프닝 끝
        
        for (String cmd : commands) {
            // 입력 수행 전 현재가 오프닝 범위라면 끝으로 이동
            if (now >= opStart && now <= opEnd) {
                now = opEnd;
            }
            
            if (cmd.equals("prev")) {
                now -= 10;
                if (now < 0) now = 0; // 10초 미만이면 0초로 이동
            } else {
                now += 10;
                if (now > video) now = video; // 10초 넘으면 끝으로 이동
            }
            
            // 입력 수행 후 오프닝 범위 재확인
            if (now >= opStart && now <= opEnd) {
                now = opEnd;
            }
        }
        
        return answer = String.format("%02d:%02d", (now / 60), (now % 60));
    }
    
    // 문자열 mm:ss => 초 단위로 변환
    private int toSecond(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}