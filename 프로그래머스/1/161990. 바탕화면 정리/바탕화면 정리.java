class Solution {
    public int[] solution(String[] wallpaper) {
        // 배열 요소의 길이: 좌표 가로길이, 배열의 길이: 좌표 세로길이
        int[] answer = {};
        
        // 최대값/최소값을 찾기 위해 엄청 큰 수, 엄청 작은 수로 초기값 설정
        int lux = Integer.MAX_VALUE; // 가장 위쪽 행 인덱스 (세로 기준 최소값)
        int luy = Integer.MAX_VALUE; // 가장 왼쪽 열의 인덱스(가로 기준 최소값)
        int rdx = Integer.MIN_VALUE; // 가장 아래쪽 행의 인덱스(세로 기준 최대값)
        int rdy = Integer.MIN_VALUE; // 가장 오른쪽 열의 인덱스(가로 기준 최대값)
        
        for (int i = 0; i < wallpaper.length; i++) { // i: 행 인덱스 (세로 좌표)
            for (int j = 0; j < wallpaper[i].length(); j++) { // j: 열 인덱스 (가로 좌표)
                // # => 파일이 존재하는 칸이므로 좌표 갱신
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i); // 가장 위쪽 행(세로)의 최소값 갱신
                    luy = Math.min(luy, j); // 가장 왼쪽 열(가로)의 최소값 갱신
                    rdx = Math.max(rdx, i); // 가장 아래쪽 행(세로)의 최대값 갱신
                    rdy = Math.max(rdy, j); // 가장 오른쪽 열(가로)의 최대값 갱신
                }
            }
        }
        // 드래그는 끝나는 좌표의 바로 다음 칸까지 포함 => + 1
        // ex) 파일이 (2,3)까지 있다면 드래그 영역의 끝점은 (3,4)
        return answer = new int[] {lux, luy, rdx + 1, rdy + 1};
    }
}