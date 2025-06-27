function solution(n, m, section) {
    var answer = 0;
    var paint = 0; // 페인트칠 된 마지막 위치
    
    for (let wall of section) {
        // 작을 경우 해당 벽은 이미 롤러로 칠해짐
        if (wall < paint) {
            continue;
        }
        // 현재 위치(wall)부터 롤러(m)길이만큼 칠하기
        paint = wall + m; // 새롭게 칠한 마지막 위치 갱신
        answer++;
    }
    
    return answer;
}