function solution(dots) {
    // 직선이 평행하다 => 두 직선의 기울기가 같다
    // 직선의 기울기 => y값의 변화량 / x값의 변화
    // 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우
    // 3가지 경우의 수 => [a-b, c-d],[a-c, b-d],[a-d, b-c]
    
    var answer = 0;
    
    var ab = (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
    var cd = (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
    var ac = (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
    var bd = (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
    var ad = (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
    var bc = (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
    
    // 같으면 두 직선의 기울기가 같음 => 평행
    if (ab === cd) answer = 1;
    if (ac === bd) answer = 1;
    if (ad === bc) answer = 1;
    
    return answer;
}